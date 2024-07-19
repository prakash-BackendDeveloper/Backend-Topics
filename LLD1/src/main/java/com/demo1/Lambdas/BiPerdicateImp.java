package com.demo1.Lambdas;

import java.util.function.BiPredicate;

public class BiPerdicateImp implements BiPredicate<String,Integer> {
    @Override
    public boolean test(String s, Integer value) {
        return s.length() > value;
    }
}
