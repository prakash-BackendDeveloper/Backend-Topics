package com.demo1.sample;
public class YieldExample extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running");
            Thread.yield();  // Suggesting to yield the CPU to another thread
        }
    }

    public static void main(String[] args) {
//        YieldExample t1 = new YieldExample();
//        YieldExample t2 = new YieldExample();
//
//        t1.start();
//        t2.start();
//      String str="Prakash";
//        System.out.println(str);
//        StringBuilder stringBuilder=new StringBuilder();
//        stringBuilder.append(str);
//        System.out.println(stringBuilder.reverse().toString());
//        str=str.concat("Hari");
//        System.out.println(str);
        int N=3, i=1;
       // System.out.println(((1<<i) & N)!=0);
        if(((1<<i) & N) !=0){
            System.out.println("Yes");
        }
        if( ((N>>i) & 1) == 1) {
            System.out.println("Yesss");
        }

    }
}
