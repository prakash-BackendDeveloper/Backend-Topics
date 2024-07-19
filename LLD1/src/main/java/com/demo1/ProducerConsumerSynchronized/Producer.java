package com.demo1.ProducerConsumerSynchronized;

import java.util.Queue;

public class Producer implements Runnable{
    private Queue<Object> store;
    private String name;
    private int maxSize;

    Producer(Queue<Object> store, String name, int maxSize){
        this.store=store;
        this.name=name;
        this.maxSize=maxSize;
    }
    @Override
    public void run() {
      while(true){
          synchronized (store){
          if(store.size()<maxSize) {
              try {
                  Thread.sleep(1000);
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }
              store.add(new Object());
              System.out.println("Producer = " + this.name + " size = " + store.size());
          }

          }
      }
    }
}
