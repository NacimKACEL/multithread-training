package com.finaxys;

import com.finaxys.thread.CuisinierBis;

public class MyMainEreinteFatale {
	
	public static void main(String[] args) throws InterruptedException {
        CuisinierBis c1 = new CuisinierBis("Casser les oeufs");
        CuisinierBis c2 = new CuisinierBis("Faire fondre le choco");
        
        Thread t1 = new Thread( ()-> c1.travailler(c2));
        Thread t2 = new Thread( ()-> c2.travailler(c1));
        
        t1.start();
        t2.start();
        
        t1.join();
        t2.join();
        
        System.out.println("Fin de la cuisine");
	}   

}
