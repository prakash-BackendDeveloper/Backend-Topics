package com.demo1.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pair<Double,Double> p= new Pair(1.1,2.2);
        Pair p5= new Pair("Scaler",2.2);
        Pair p1= new Pair(1.1,2.2);
        Pair p2= new Pair(1.1,2.2);
        Pair p3= new Pair(1.1,2.2);
        List<Pair> pairList=new ArrayList<Pair>();
        pairList.add(p1);
        pairList.add(p2);
        pairList.add(p3);
       // System.out.println(pairList);
      double a=(double) p5.first;
      double b=(double) p5.second;
        System.out.println(a +" "+ b);
        List<Pair> pairList1 = Arrays.asList(p1,p2,p3);
      //  System.out.println(pairList1);
    }
}
