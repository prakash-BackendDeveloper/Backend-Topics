package com.demo1.AdderSubtractorDifferentObject;

public class Count {
    private int value;

    public synchronized void updateValue(int number) {
        value+=number;
    }

    public int getValue(){
        return value;
    }
}
