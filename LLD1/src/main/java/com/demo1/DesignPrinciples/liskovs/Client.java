package com.demo1.DesignPrinciples.liskovs;

import com.demo1.generics.Dog;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Bird b1=new Crow();
        Flying f1= (Flying) b1;
        Dancing d1=(Dancing) b1;
        f1.fly();
        d1.dance();

        Bird b2=new Sparrow();
        Flying f2=(Flying) b2;
      //  Dancing d2=(Dancing) b2;
        f2.fly();
       // d2.dance(); //wrong

        Bird b3=new Pigeon();
        Flying f3=(Flying) b3;
        Dancing d3=(Dancing) b3;
        f3.fly();
        d3.dance();

        Bird b4=new Penguin();
      //  Flying f4=(Flying) b4;
      //  f4.fly();
        Dancing d4=(Dancing) b4;
        d4.dance();

        System.out.println();
        List<Flying> flyingList=new ArrayList<>();
        flyingList.add(f1);
        flyingList.add(f2);
        flyingList.add(f3);

        for(Flying f:flyingList){
            f.fly();
        }
    }
}
