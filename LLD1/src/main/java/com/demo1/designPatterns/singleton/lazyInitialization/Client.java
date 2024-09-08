package com.demo1.designPatterns.singleton.lazyInitialization;


public class Client {
    public static void main(String[] args) {
        //Usual Object Creation
        System.out.println();
        DatabaseConnection dbc1=DatabaseConnection.getInstance();
        System.out.println(dbc1);
       DatabaseConnection dbc2=DatabaseConnection.getInstance();
        System.out.println(dbc2);

        //Multithreaded way to  Object creation
        System.out.println();
        DBObjectCreation dbObjectCreation=new DBObjectCreation();
        Thread t1=new Thread(dbObjectCreation);
        t1.start();
        Thread t2=new Thread(dbObjectCreation);
        t2.start();

        //Using Lambda in MultiThreaded
        System.out.println();
        Thread t3=new Thread(()->{
            DatabaseConnection dbc3=DatabaseConnection.getInstance();
            System.out.println(dbc3);
        });
        t3.start();
        Thread t4=new Thread(()->{
            DatabaseConnection dbc4= DatabaseConnection.getInstance();
            System.out.println(dbc4);
        });
        t4.start();
    }
}
