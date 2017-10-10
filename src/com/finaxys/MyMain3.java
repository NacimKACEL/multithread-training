package com.finaxys;

import com.finaxys.thread.Cuisinier;

public class MyMain3 {

	public static void main(String[] args) throws InterruptedException {
		
		Cuisinier c1 = new Cuisinier("Casser les oeufs et battre");
        Cuisinier c2 = new Cuisinier("Faire fondre le chocolat et mélanger au beurre");
        
        Thread t1 = new Thread(c1);
        t1.start();
        Thread t2 = new Thread(c2);
        t2.start();
        // attendre que t1 se termine 
        t1.join();
        
        // attendre que t2 se termine
        t2.join();
        
        System.out.println("Réaliser l'appareil ...");
	}

}
