package com.demo1.DesignPrinciples.dependencyInversion;

import com.demo1.generics.Cat;
import com.demo1.generics.Dog;

public class Client {
    public static void main(String[] args) {
        Bird b1=new Crow();
        b1.fly();
        Bird b2=new Sparrow();
        b2.fly();
        Bird b3=new Pigeon();
        b3.fly();
        Bird b4=new Owl();
        b4.fly();
    }
}
