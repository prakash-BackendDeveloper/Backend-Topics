package com.demo1.Pair;

public class Pair<V,T> {
    Object first;
    Object second;
    public Pair(Object first, Object second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "[ first = " +first+", second = " +second +" ]\n";
    }
}
