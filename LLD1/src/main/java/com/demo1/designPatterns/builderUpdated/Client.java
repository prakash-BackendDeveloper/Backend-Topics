package com.demo1.designPatterns.builderUpdated;

public class Client {
    public static void main(String[] args) {
//        Builder builder = Student.getBuilder();
//        builder.setName("Jegan");
//        builder.setAge(22);
//        builder.setBatch("Sep-24");
//        builder.setPsp(90.22);
//        builder.setGradYear(2021);
       // Student student=new Student(builder);
      //  Student student=new Student(null);
      //  Student student = builder.build();

        Student student=Student.getBuilder()
                .setAge(22)
                   .setName("Jegan")
                      .setBatch("Sep-24")
                              .setPsp(90.33)
                                      .setGradYear(2023).build();




        System.out.println("debug");
    }

}
