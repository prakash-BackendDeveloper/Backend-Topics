package com.demo1.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Animal> animals = new ArrayList<>();
        List<Cat> cats = new ArrayList<>();
        List<Dog> dogs = new ArrayList<>();
        List<Human> humans = new ArrayList<>();
        doSomething(animals);
        doSomething(cats);
        doSomething(dogs);
      //  doSomething(humans);



    }

    public static void doSomething(List<? extends Animal> animals){
        System.out.println("List from DoSomething");
    }
}
