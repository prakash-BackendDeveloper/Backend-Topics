package com.demo1.DesignPrinciples.dependencyInversion;

public class Pigeon extends Bird{

    FlyingBehaviour flyingBehaviour=new PigeonOwlFlyingBehaviour();

    @Override
    void eat() {
        System.out.println("Pigeon is eating");
    }

    @Override
    void fly() {
        flyingBehaviour.fly();
    }
}
