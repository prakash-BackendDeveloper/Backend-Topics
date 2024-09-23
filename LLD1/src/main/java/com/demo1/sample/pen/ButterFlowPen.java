package com.demo1.sample.pen;

public class ButterFlowPen extends BallPointPen implements Refillable{
    String name;


    @Override
    void write() {
        System.out.println("ButterFlowPen write");
    }
    @Override
    public void refill() {
        System.out.println("ButterFlowPen refill");
    }
}
