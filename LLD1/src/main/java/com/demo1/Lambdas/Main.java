package com.demo1.Lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {

        //way -1
        BiPredicate<String,Integer> biPredicate=new BiPerdicateImp();
        System.out.println( biPredicate.test("Scaler",4));


        //way-2
        BiPredicate<String,Integer> biPredicate1=new BiPredicate<String, Integer>() {
            @Override
            public boolean test(String s, Integer integer) {
                return s.length() > integer;
            }
        };
        System.out.println( biPredicate1.test("Scaler",4));

        //way-3
        BiPredicate<String,Integer> biPredicate2=(s,integer)->{return s.length() > integer;};
        System.out.println( biPredicate2.test("Scaler",9));

        BiPredicate<String,Integer> biPredicate3=(s,integer)-> s.length() > integer;
        System.out.println( biPredicate3.test("Scaler",9));

        BinaryOperator<String> bo=(s,s1)->s+s1;
        System.out.println(bo.apply("Scaler","bangalore"));

        List<Integer> list= Arrays.asList(9,8,7,6,5,4,3);
        Collections.sort(list);
        System.out.println(list);
    }
}
