package com.demo1.sample.pen;

public class Client {
    public static void main(String[] args) {
        Pen pen=new ButterFlowPen();
        //pen.refill();
        Refillable refillable=new ButterFlowPen();
        refillable.refill();
       // Refillable refillable1=new WritometerPen();
    }
}
