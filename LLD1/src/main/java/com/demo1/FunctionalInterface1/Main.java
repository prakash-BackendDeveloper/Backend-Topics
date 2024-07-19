package com.demo1.FunctionalInterface1;

public class Main {
    public static void main(String[] args) {
        testInterface<String> test=(s -> {
            System.out.println("Scaler"+s);
        });
        test.fun1("bangalore");
    }
}
