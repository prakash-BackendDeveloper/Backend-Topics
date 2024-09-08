package com.demo1.designPatterns.singleton.lazyInitialization;

import com.demo1.designPatterns.singleton.lazyInitialization.DatabaseConnection;

public class DBObjectCreation implements Runnable{
    @Override
    public void run() {
        DatabaseConnection dbc= DatabaseConnection.getInstance();
        System.out.println(dbc);
    }
}
