package com.demo1.DesignPrinciples.birdV1;

public class Sparrow extends Bird_V1{
    String sound="ki_ki";
    @Override
    void fly(String type) {
        this.age=5;
        this.type=type;
        System.out.println("I am "+type);
        System.out.println("I am "+age+" years old");
        System.out.println(sound+" is my sound");
    }
}
