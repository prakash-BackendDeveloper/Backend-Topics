package com.demo1.DesignPrinciples.birdv1_enhancement;

import com.demo1.DesignPrinciples.Bird;
import com.demo1.DesignPrinciples.birdV1.Bird_V1;
import com.demo1.DesignPrinciples.birdV1.Eagle;

public class Client {
    public static void main(String[] args) {
      BirdV1 b1=new Crow();
       Crow c1=(Crow) b1;
       c1.fly("Crow");
       c1.dance();

      BirdV1 b2=new Sparrow();
      Sparrow s1=(Sparrow) b2;
      s1.fly("Sparrow");
      s1.dance();

      BirdV1 b3=new Penguin();
      Penguin p1=(Penguin) b3;
     // p1.fly();  Giving error. fly method not in penguin class. so we cannot even call
     p1.dance();

    }
}
