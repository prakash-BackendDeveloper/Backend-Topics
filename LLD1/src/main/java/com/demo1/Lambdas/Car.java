package com.demo1.Lambdas;

public class Car {

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

//            toString(){
//                System.out.println("Name = "+name +"price = "+price +"speed  ="+speed);
//            }
    }


