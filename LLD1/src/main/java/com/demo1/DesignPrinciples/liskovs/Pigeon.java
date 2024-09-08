package com.demo1.DesignPrinciples.liskovs;

public class Pigeon extends Bird implements Flying,Dancing{
    @Override
    void sound() {
        System.out.println("Pigeon sound");
    }

    @Override
    public void fly() {
        System.out.println("Pigeon fly");
    }

    @Override
    public void dance() {
        System.out.println("Pigeon dance");
    }
}
