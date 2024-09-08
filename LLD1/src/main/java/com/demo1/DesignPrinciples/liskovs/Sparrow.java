package com.demo1.DesignPrinciples.liskovs;

public class Sparrow extends Bird implements Flying{
    @Override
    void sound() {
        System.out.println("Sparrow Sound");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow fly");
    }
}
