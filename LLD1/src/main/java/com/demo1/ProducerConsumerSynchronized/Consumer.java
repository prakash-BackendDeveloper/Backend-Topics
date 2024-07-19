package com.demo1.ProducerConsumerSynchronized;

import java.util.Queue;

public class Consumer implements Runnable{
    private Queue<Object> store;
    private String name;
    private int maxSize;

    Consumer(Queue<Object> store, String name, int maxSize){
        this.store=store;
        this.name=name;
        this.maxSize=maxSize;
    }
    @Override
    public void run() {
        while(true){
            synchronized (store){
            if(store.size()>0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                store.remove();
                System.out.println("Consumer = " + this.name + " size = " + store.size());
            }
            }
        }
    }
}