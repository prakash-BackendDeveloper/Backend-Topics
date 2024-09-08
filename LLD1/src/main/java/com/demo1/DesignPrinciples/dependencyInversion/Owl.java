package com.demo1.DesignPrinciples.dependencyInversion;

public class Owl extends Bird{
    FlyingBehaviour flyingBehaviour=new PigeonOwlFlyingBehaviour();

    @Override
    void eat() {
        System.out.println("Owl eat");
    }

    @Override
    void fly() {
        flyingBehaviour.fly();
    }

}
