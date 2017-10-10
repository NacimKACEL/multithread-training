package com.finaxys;

import com.finaxys.thread.Cuisinier;

public class MyMain4 {
	
	public static void main(String[] args) throws InterruptedException {
		
		Cuisinier c1 = new Cuisinier(" Faire fondre le chocolat");
        Cuisinier c2 = new Cuisinier("Casser les oeufs");
        
        Thread t1 = new Thread(c1, "Fabien");
        Thread t2 = new Thread(c2, "Xavier");
        
        t1.start();
        t2.start();
        
        t1.join();
        
        if (t1.isAlive()) {
        		System.out.println("t1 est vivant ...");
        } else {
        		System.out.println("t1 est mort ...");
        }
        
        t2.join();
        
        if (t2.isAlive()) {
    			System.out.println("t1 est vivant ...");
        } else {
    			System.out.println("t1 est mort ...");
        }
        
        System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getId());
        
        System.out.println("Faire le mélange");
	}
}
	
