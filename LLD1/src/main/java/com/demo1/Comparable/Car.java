package com.demo1.Comparable;

import java.util.Comparator;

public class Car implements Comparable<Car> {

         int price;
         String name;
         int speed;

        Car(String name, int price, int speed) {
            this.name = name;
            this.price = price;
            this.speed = speed;
        }

        public String toString() {
            return "[Name = "+this.name +" price = "+this.price +" speed  ="+this.speed +" ]\n";
        }


    @Override
    public int compareTo(Car o) {
        return o.speed-this.speed;
    }

//            toString(){
//                System.out.println("Name = "+name +"price = "+price +"speed  ="+speed);
//            }
    }


