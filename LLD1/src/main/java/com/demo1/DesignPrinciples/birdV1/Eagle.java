package com.demo1.DesignPrinciples.birdV1;

public class Eagle extends Bird_V1{
    String sound="Some Kind of Big sound";
    @Override
    void fly(String type) {
        this.age=20;
        this.type=type;
        System.out.println("I am "+type);
        System.out.println("I am "+age+" years old");
        System.out.println(sound+" is my sound");
    }
}
