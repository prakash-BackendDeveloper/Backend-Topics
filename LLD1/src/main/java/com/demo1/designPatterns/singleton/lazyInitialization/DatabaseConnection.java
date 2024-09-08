package com.demo1.designPatterns.singleton.lazyInitialization;

import org.springframework.data.jpa.repository.Lock;

public class DatabaseConnection {
    private static DatabaseConnection dbc=null;
    String url;
    String username;
    String password;
    private DatabaseConnection(){}
    public static DatabaseConnection getInstance(){
        if(dbc==null){
            synchronized (DatabaseConnection.class){
                if(dbc==null){
                    dbc=new DatabaseConnection();
                }
            }
        }
        return dbc;
    }
}
