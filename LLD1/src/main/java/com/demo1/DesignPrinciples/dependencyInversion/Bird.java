package com.demo1.DesignPrinciples.dependencyInversion;

public abstract class Bird {
    String name;
    int age;
    int weight;
    String color;
    String type;

    abstract void eat();
    abstract void fly();
}
