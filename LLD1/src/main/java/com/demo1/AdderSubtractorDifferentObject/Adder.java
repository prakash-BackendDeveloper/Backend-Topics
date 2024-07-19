package com.demo1.AdderSubtractorDifferentObject;

public class Adder implements Runnable{
    private Count count;
    Adder(Count count){
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=1;i<=1000000;i++){
            count.updateValue(i);
        }
    }

}
