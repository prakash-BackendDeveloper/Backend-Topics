package com.demo1.streams;


import com.demo1.Lambdas.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static class Car {

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
    public static void main(String[] args) {
        Car car1=new Car("c1",1500,20);
        Car car2=new Car("c2",1800,40);
        Car car3=new Car("c3",1000,10);
        Car car4=new Car("c4",800,70);
        Car car5=new Car("c5",1900,50);
        Car car6=new Car("c6",2000,5);

        List<Car> carList= Arrays.asList(car1,car2,car3,car4,car5,car6);

        List<Integer> list=List.of(1,2,3,4,5,6,7,8,9);
        Stream<Integer> stream = list.stream();

        Integer a[]={1,2,3};
        Stream<Integer> stream1=Stream.of(a);

//        List<Integer> evenNumbers=new ArrayList<>();
//        for(int i=0;i<list.size();i++){
//            if(list.get(i)%2==0){
//                evenNumbers.add(list.get(i));
//            }
//        }
//        System.out.println(evenNumbers);

//       Stream<Integer> stream2 = list.stream().filter(new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//               return integer%2==0;
//            }
//        });
//        System.out.println(stream2.toList());

        Stream<Integer> stream2 = list.stream().filter((num)-> num%2==0);

        System.out.println(stream2.toList());

        Stream<Car> stream3 = carList.stream().filter((car) -> car.price>1500 );

        System.out.println(stream3.toList());

        Stream<Integer> stream4=carList.stream().map((car -> {return car.price;}));

        System.out.println(stream4.toList());

        Stream<Boolean> stream5=carList.stream().map((car -> {return car.price>1000;}));

        System.out.println(stream5.toList());
    }
}
