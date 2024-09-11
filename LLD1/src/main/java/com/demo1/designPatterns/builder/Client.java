package com.demo1.designPatterns.builder;


import org.w3c.dom.ls.LSOutput;

public class Client {
    public static void main(String[] args) {
        Builder builder=new Builder();
        builder.setName("Jegan");
        builder.setAge(22);
        builder.setBatch("Sep-24");
        builder.setPsp(90.22);
        builder.setGradYear(2023);
        Student student=new Student(builder);
        System.out.println("debug");
    }
}
