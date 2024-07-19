package com.demo1.producerConsumerSemaphore;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Queue<Object> store= new ConcurrentLinkedDeque<>();
        int maxSize=4;
        Semaphore prodS=new Semaphore(maxSize);
        Semaphore consS=new Semaphore(0);

        Producer p1=new Producer(store, "p1", maxSize,prodS,consS);
        Producer p2=new Producer(store, "p2", maxSize,prodS,consS);
        Producer p3=new Producer(store, "p3", maxSize,prodS,consS);

        Consumer c1=new Consumer(store, "c1", maxSize,prodS,consS);
        Consumer c2=new Consumer(store, "c2", maxSize,prodS,consS);
        Consumer c3=new Consumer(store, "c3", maxSize,prodS,consS);
        Consumer c4=new Consumer(store,"c4",maxSize,prodS,consS);

        Thread t1= new Thread(p1);
        Thread t2= new Thread(p2);
        Thread t3= new Thread(p3);

        Thread t4= new Thread(c1);
        Thread t5= new Thread(c2);
        Thread t6= new Thread(c3);
        Thread t7=new Thread(c4);


        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();


    }
}
