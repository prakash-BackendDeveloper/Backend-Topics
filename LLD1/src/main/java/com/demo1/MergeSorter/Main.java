package com.demo1.MergeSorter;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> listToSort = List.of(8,7,9,5,6,4,3,2,1);
        ExecutorService executorService= Executors.newCachedThreadPool();
        MergeSorter mergeSorter=new MergeSorter(listToSort, executorService);

        Future<List<Integer>> futureSortedList = executorService.submit(mergeSorter);

        List<Integer> sortedList = futureSortedList.get();

        System.out.println(sortedList);

    }
}
