package com.demo1.designPatterns.singleton.eagerInitialization;

public class DatabaseConnection {
    public static DatabaseConnection dbc=new DatabaseConnection();
    String url;
    String username;
    String password;
    private DatabaseConnection(){}
    public static DatabaseConnection getInstance(){
        return dbc;
    }
}
