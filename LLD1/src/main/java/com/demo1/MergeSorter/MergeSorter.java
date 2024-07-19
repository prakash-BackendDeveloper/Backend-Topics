package com.demo1.MergeSorter;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {
  private List<Integer> listToSort;
  private ExecutorService executorService;

  public MergeSorter(List<Integer> listToSort, ExecutorService executorService) {
      this.listToSort = listToSort;
      this.executorService=executorService;
  }

    @Override
    public List<Integer> call() throws Exception {
      int n=listToSort.size();
      if(n<=1){
          return listToSort;
      }
        ArrayList<Integer> leftHalf=new ArrayList<>();
        ArrayList<Integer> rightHalf=new ArrayList<>();

        for(int i=0;i<n/2;i++){
            leftHalf.add(listToSort.get(i));
        }
        for(int i=n/2;i<n;i++){
            rightHalf.add(listToSort.get(i));
        }
        MergeSorter LeftMergeSorter = new MergeSorter(leftHalf,executorService);
        MergeSorter RightMergeSorter = new MergeSorter(rightHalf, executorService);

        Future<List<Integer>> futureLeftSortedList = executorService.submit(LeftMergeSorter);
        Future<List<Integer>> futureRightSortedList = executorService.submit(RightMergeSorter);

        List<Integer> leftSortedList = futureLeftSortedList.get();
        List<Integer> rightSortedList = futureRightSortedList.get();

        List<Integer> sortedList = new ArrayList<>();

        int i=0,j=0;
        while(i<leftSortedList.size() && j<rightSortedList.size()){
            if(leftSortedList.get(i)<rightSortedList.get(j)){
                sortedList.add(leftSortedList.get(i));
                i++;
            }
            else{
                sortedList.add(rightSortedList.get(j));
                j++;
            }
        }
        while(i<leftSortedList.size()){
            sortedList.add(leftSortedList.get(i));
            i++;
        }
        while(j<rightSortedList.size()){
            sortedList.add(rightSortedList.get(j));
            j++;
        }


       return sortedList;
    }
}
