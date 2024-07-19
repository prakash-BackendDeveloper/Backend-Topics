package com.demo1.concurrancy;

public class Main {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        Thread thread = new Thread(helloWorldPrinter);
        thread.start();

        Thread thread1 = new Thread(helloWorldPrinter);
        thread1.start();

        Thread thread2 = new Thread(helloWorldPrinter);
        thread2.start();

        System.out.println(Thread.currentThread().getName());
    }
}
