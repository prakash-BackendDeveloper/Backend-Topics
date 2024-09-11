package com.demo1.designPatterns.builder;

public class Student {
    private String name;
    private int age;
    private double psp;
    private int gradYear;
    private String batch;

    Student(Builder builder){
      if(builder.getAge()<20){
          throw new RuntimeException("Age must be above 20");
      }
      if(builder.getGradYear()>2022){
          throw new RuntimeException("GradYear must be below 2022");
      }
      this.name = builder.getName();
      this.age = builder.getAge();
      this.psp = builder.getPsp();
      this.gradYear = builder.getGradYear();
      this.batch = builder.getBatch();

    }


}
