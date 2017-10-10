package com.finaxys;

public class MyMain2 {

	public static void main(String[] args) {
		Thread t = new Thread( () -> {
	         
            for(int i=0; i<10; i++) {
                 System.out.println("le thread tourne ...");
                             
            if(Thread.interrupted()) {
                System.out.println("Thread interrompu");
            
                break;
            }
            }
    });
    
    t.start();
    
    for( int i =0; i<100; i++) {
        System.out.println("main thread");
    }
    
    t.interrupt();

	}

}
