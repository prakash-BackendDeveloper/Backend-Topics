package com.demo1.DesignPrinciples;

public class Bird {
    String name;
    int age;
    int weight;
    String color;
    String type;
    void fly(String type){
        if(type.equals("Crow")) {
            this.age=10;
            this.type="Crow";
            System.out.println("I am "+type);
            System.out.println("I am "+age+" years old");
        }
        if(type.equals("Sparrow")) {
            this.age=20;
            this.type="Sparrow";
            System.out.println("I am "+type);
            System.out.println("I am "+age+" years old");
        }
        if(type.equals("Eagle")) {
            this.age=30;
            this.type="Eagle";
            System.out.println("I am "+type);
            System.out.println("I am "+age+" years old");
        }
    }
}
