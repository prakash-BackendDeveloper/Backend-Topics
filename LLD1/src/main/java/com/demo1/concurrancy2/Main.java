package com.demo1.concurrancy2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        NumberPrinter numberPrinter;
        Thread t;
//        for (int i = 1; i <= 100; i++) {
//            numberPrinter = new NumberPrinter(i);
//            t = new Thread(numberPrinter);
//            t.start();
//        }

        ExecutorService executorService=Executors.newFixedThreadPool(10);
        for (int i = 1; i <= 100; i++) {
            numberPrinter = new NumberPrinter(i);
            executorService.submit(numberPrinter);
        }
        //adding some lines

        executorService.shutdown();

        //adding few
    }
}
