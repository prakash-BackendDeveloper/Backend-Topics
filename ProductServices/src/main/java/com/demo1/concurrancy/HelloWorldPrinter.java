package com.demo1.concurrancy;

public class HelloWorldPrinter implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello World"+ Thread.currentThread().getName());
      //  System.out.println();
    }
}
