package com.demo1.DesignPrinciples.dependencyInversion;

public class Sparrow extends Bird{
    FlyingBehaviour flyingBehaviour=new SparrowCrowFlyingBehaviour();
    @Override
    void eat() {
        System.out.println("Sparrow eat");
    }

    @Override
    void fly() {
        flyingBehaviour.fly();
    }
}
