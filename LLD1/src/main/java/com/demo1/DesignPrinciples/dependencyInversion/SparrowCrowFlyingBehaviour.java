package com.demo1.DesignPrinciples.dependencyInversion;

public class SparrowCrowFlyingBehaviour implements FlyingBehaviour{
    @Override
    public void fly() {
        System.out.println("Sparrow Crow Flying Behaviour");
    }
}
