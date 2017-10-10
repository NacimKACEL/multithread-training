package com.finaxys;

import java.util.concurrent.*;

public class MyMainCollectionConcurrente {

static BlockingQueue bq = new ArrayBlockingQueue(3);
    
    public static void main(String[] args) {
        
        new Thread( () -> {
            for (int i=0; i<100; i++)
            {
                System.out.println("je produis ...");
                try {
                    bq.put(i);
                } catch (InterruptedException ex) {
                    //...
                }
                System.out.println("fini de produire");
            }
        }).start();
        
         new Thread( () -> {
            for (int i=0; i<50; i++)
            {
                System.out.println("A consomme ...");
                try {
                   System.out.println(bq.take());
                } catch (InterruptedException ex) {
                    //...
                }
                System.out.println(" A finit de consommer");
            }
        }).start();
         
          new Thread( () -> {
            for (int i=0; i<50; i++)
            {
                System.out.println("B consomme ...");
                try {
                   System.out.println(bq.take());
                } catch (InterruptedException ex) {
                    //...
                }
                System.out.println(" B finit de consommer");
            }
        }).start();
    }

}
