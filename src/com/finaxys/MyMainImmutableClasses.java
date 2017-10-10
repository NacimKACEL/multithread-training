package com.finaxys;

import com.finaxys.thread.Personne;

public class MyMainImmutableClasses {

	static Personne p ;
    public static void main(String[] args) {
      
        new Thread( ()-> {
            p = new Personne("fabien");
            
            for( int i=0; i<10; i++) {
                System.out.println("La personne "+p.getNom());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    //...
                }
            }
            
        }).start();
        
        
        new Thread( ()-> {
            for( int j=0 ; j<100; j++) {
                
                if( p !=null) {
                    System.out.println("Modifs...");
                    p = p.remplaceNom("Xavier");
                }
                
            }
        }).start();
    }

}
