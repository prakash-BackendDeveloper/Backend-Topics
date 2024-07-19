package com.demo1.ProducerConsumerSynchronized;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Main {
    public static void main(String[] args) {
        Queue<Object> store= new ConcurrentLinkedDeque<>();
        int maxSize=6;

        Producer p1=new Producer(store, "p1", maxSize);
        Producer p2=new Producer(store, "p2", maxSize);
        Producer p3=new Producer(store, "p3", maxSize);

        Consumer c1=new Consumer(store, "c1", maxSize);
        Consumer c2=new Consumer(store, "c2", maxSize);
        Consumer c3=new Consumer(store, "c3", maxSize);
        Consumer c4=new Consumer(store,"c4",maxSize);

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
