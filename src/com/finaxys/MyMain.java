package com.finaxys;

import com.finaxys.thread.MyThread;
import com.finaxys.thread.MyThread2;

public class MyMain {

	public static void main(String[] args) {
		// par héritage
		MyThread t1 = new MyThread();
		t1.start();
		
		// par interface
		new Thread(new MyThread2()).start();
		
		// par classe annonyme
		new Thread(new Runnable() {
			@Override
			public void run() {
				//bla bla bala balalala	
			}
		}).start();
		
		// par lambda expression
		
		new Thread(() -> {
			System.out.println("coucou");
		}).start(); 
		
		System.out.println("End of main ...");

	}

}
