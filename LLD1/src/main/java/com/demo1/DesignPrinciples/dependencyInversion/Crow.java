package com.demo1.DesignPrinciples.dependencyInversion;

public class Crow extends Bird{
    FlyingBehaviour flyingBehaviour=new SparrowCrowFlyingBehaviour();

    @Override
    void eat() {
        System.out.println("Crow eat");
    }

    @Override
    void fly() {
       flyingBehaviour.fly();
    }
}
