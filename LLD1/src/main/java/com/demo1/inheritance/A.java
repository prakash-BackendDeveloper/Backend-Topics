package com.demo1.inheritance;

public class A {
//    String name;
//    int age=8;
//    int mobile;
//    static final String univName="Scaler";

    int number;
    A(){}
    A(int number) {
        this.number = number;
    }

    void printNumber(){

        System.out.println(number);
    }
    void something(){
        System.out.println("A something");
    }

}
