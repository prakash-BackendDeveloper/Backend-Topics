package com.demo1.DesignPrinciples.birdV1;

import com.demo1.DesignPrinciples.Bird;

public class Client {
    public static void main(String[] args) {
        Bird_V1 b1=new Crow();
        b1.fly("Crow");
        Bird_V1 b2=new Sparrow();
        b2.fly("Sparrow");
        Bird_V1 b3=new Eagle();
        b3.fly("Eagle");
    }
}
