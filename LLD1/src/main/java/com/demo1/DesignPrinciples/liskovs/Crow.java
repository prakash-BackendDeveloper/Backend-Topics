package com.demo1.DesignPrinciples.liskovs;

public class Crow extends Bird implements Flying,Dancing{


    @Override
    void sound() {
        System.out.println("Crow sound");
    }

    @Override
    public void fly() {
        System.out.println("Crow fly");
    }

    @Override
    public void dance() {
        System.out.println("Crow dance");
    }
}
