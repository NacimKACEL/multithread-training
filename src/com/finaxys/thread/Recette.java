package com.finaxys.thread;

public class Recette {
    
    private boolean oeufsOk = false;
    private boolean chocoFondu = false;

     synchronized void faireFondreChoco() {
        System.out.println("choco fondu");
        if(!oeufsOk){
            try {
                wait();
            } catch (InterruptedException ex) {
                //...
            }
        }
        
        System.out.println("Alors finissons le mélange !");
        
    }

    synchronized void casserLesOeufs() {
        System.out.println("oeufs cassés");
        oeufsOk=true;
        notifyAll();
    }
    
    
}
