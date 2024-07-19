package com.demo1.concurrancy2;

public class NumberPrinter implements Runnable{
  private int number;
  public NumberPrinter(int number) {
      this.number = number;
  }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": " + number);
    }
}
