package com.demo1.producerConsumerSemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    private Queue<Object> store;
    private String name;
    private int maxSize;
    private Semaphore prodS;
    private Semaphore consS;

    Producer(Queue<Object> store, String name, int maxSize, Semaphore prods,
             Semaphore consS){
        this.store=store;
        this.name=name;
        this.maxSize=maxSize;
        this.prodS=prods;
        this.consS=consS;
    }
    @Override
    public void run() {
      while(true){
          try {
              prodS.acquire();
          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }
          store.add(new Object());
              System.out.println("Producer = " + this.name + " size = " + store.size());
              consS.release();
      }
    }
}
