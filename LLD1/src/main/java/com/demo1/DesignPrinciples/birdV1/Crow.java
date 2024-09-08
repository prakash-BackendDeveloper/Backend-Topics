package com.demo1.DesignPrinciples.birdV1;

public class Crow extends Bird_V1 {
    String sound="ka_ka";

    @Override
    void fly(String type) {
        this.age=10;
        this.type=type;
        System.out.println("I am "+type);
        System.out.println("I am "+age+" years old");
        System.out.println(sound+" is my sound");
    }
}
