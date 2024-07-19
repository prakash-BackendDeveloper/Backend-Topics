package com.demo1.Lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        Car car1=new Car("c1",1500,20);
        Car car2=new Car("c2",1800,40);
        Car car3=new Car("c3",1000,10);
        Car car4=new Car("c4",800,70);
        Car car5=new Car("c5",1900,50);
        Car car6=new Car("c6",2000,5);

        List<Car> carList= Arrays.asList(car1,car2,car3,car4,car5,car6);
        System.out.println(carList);

//        Comparator<Car> comparator=new Comparator<Car>() {
//            @Override
//            public int compare(Car o1, Car o2) {
//                return o1.price - o2.price;
//            }
//        };
//
//       Collections.sort(carList,comparator);
//        System.out.println(carList);

//        Comparator<Car> comparator= new Comparator<Car>() {
//            @Override
//            public int compare(Car o1, Car o2) {
//                return o2.speed - o1.speed;
//            }
//        };
//        Collections.sort(carList,comparator);
//        System.out.println(carList);

//        Comparator<Car> comparator=(o1,o2)-> o1.price - o2.price;
//
//        Collections.sort(carList,comparator);

        Collections.sort(carList,(o1,o2)-> o1.speed - o2.speed);

        System.out.println(carList);
    }
}
