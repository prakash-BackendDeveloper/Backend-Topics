package com.demo1.DesignPrinciples.liskovs;

public class Penguin extends Bird implements Dancing{
    @Override
    void sound() {
        System.out.println("Penguin sound");
    }

    @Override
    public void dance() {
        System.out.println("Penguin dance");
    }
}
