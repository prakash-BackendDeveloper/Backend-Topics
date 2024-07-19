package com.demo1.FunctionalInterface1;

@FunctionalInterface
public interface testInterface<T> {
     public void fun1(T t);
     default void fun2(){
         System.out.println("Hi");
     }




}
