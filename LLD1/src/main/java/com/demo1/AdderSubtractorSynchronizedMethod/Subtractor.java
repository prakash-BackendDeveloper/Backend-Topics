package com.demo1.AdderSubtractorSynchronizedMethod;

public class Subtractor implements Runnable{
    private Count count;
    Subtractor(Count count){
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=1;i<=1000000;i++){
            count.updateValue(-i);
        }
    }
}
