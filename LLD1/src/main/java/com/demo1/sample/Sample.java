package com.demo1.sample;


import java.util.ArrayList;
import java.util.List;

public class Sample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        Pair<Integer> pair = new Pair<>(list);
        System.out.println(pair.getFirstElement());
        System.out.println(getFirstElement(list));


    }
    private static <K> K getFirstElement(List<K> T){
        return T.get(0);
    }
}
