package com.finaxys.thread;

public class MyThread2 implements Runnable{

	@Override
	public void run() {
		for (int i=0; i<1000; i++) 
			System.out.println("Le thread qui implémente Runnable");
		
	}

}
