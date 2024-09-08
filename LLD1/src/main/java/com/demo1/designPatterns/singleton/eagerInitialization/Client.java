package com.demo1.designPatterns.singleton.eagerInitialization;

public class Client {
    public static void main(String[] args) {
        System.out.println();
        DatabaseConnection dbc1=DatabaseConnection.getInstance();
        System.out.println(dbc1);
        DatabaseConnection dbc2=DatabaseConnection.getInstance();
        System.out.println(dbc2);
    }
}
