package com.demo1.designPatterns.builderUpdated;

public class Student {
    private String name;
    private int age;
    private double psp;
    private int gradYear;
    private String batch;

    private Student(Builder builder) {
        if(builder.getAge()<20){
            throw new RuntimeException("Age should be above 20");
        }
        if(builder.getGradYear()>2022){
            throw new RuntimeException("GradYear should be below 2022");
        }
        this.name = builder.getName();
        this.age = builder.getAge();
        this.psp = builder.getPsp();
        this.gradYear = builder.getGradYear();
        this.batch = builder.getBatch();

    }
    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder {
        private String name;
        private int age;
        private double psp;
        private int gradYear;
        private String batch;

        Builder(){

        }
        public Student build(){
            return new Student(this);
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }
    }
}
