package com.demo1.DesignPrinciples.birdv1_enhancement;

public class Crow extends FlyingBirds{
    String sound="ka_ka";
    @Override
    void fly(String type) {
        this.age=10;
        this.type=type;
        System.out.println("I am "+type);
        System.out.println("I am "+age+" years old");
        System.out.println(sound+" is my sound");
    }

    @Override
    void dance() {
        System.out.println(type +" is dancing");
        System.out.println();
    }
}
