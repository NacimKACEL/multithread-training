package com.finaxys.thread;

public class Marmiton implements Runnable{

    private Recette recette;
    
    public Marmiton(Recette recette) {
        this.recette = recette;
    }
    
    @Override
    public void run() {
       recette.casserLesOeufs();
    }
    
}
