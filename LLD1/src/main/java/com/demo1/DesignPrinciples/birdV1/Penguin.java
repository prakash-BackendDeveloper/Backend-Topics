package com.demo1.DesignPrinciples.birdV1;

public class Penguin extends Bird_V1{
    @Override
    void fly(String type) {
        System.out.println("Penguin won't fly");
    }
}
