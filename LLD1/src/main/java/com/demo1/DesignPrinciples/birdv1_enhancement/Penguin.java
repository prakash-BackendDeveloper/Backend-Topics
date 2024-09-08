package com.demo1.DesignPrinciples.birdv1_enhancement;

public class Penguin extends NonFlyingBirds{

    @Override
    void dance() {
        this.type="penguin";
        System.out.println(type +" is dancing");
    }
}
