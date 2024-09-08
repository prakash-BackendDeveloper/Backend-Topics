package com.demo1.designPatterns.singleton.eagerInitializationMultiThreaded;

public class DBObjectCreation implements Runnable{
    @Override
    public void run() {
        DatabaseConnection dbc=DatabaseConnection.getInstance();
        System.out.println(dbc);
    }
}
