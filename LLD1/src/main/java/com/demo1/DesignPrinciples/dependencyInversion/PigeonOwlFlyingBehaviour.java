package com.demo1.DesignPrinciples.dependencyInversion;

public class PigeonOwlFlyingBehaviour implements FlyingBehaviour{
    @Override
    public void fly() {
        System.out.println("Pigeon Owl Flying Behaviour");
    }
}
