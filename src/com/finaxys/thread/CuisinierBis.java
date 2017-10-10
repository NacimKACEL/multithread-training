package com.finaxys.thread;

public class CuisinierBis {
	
	private boolean fini=false;
    private String tache;
    
    public CuisinierBis(String tache) {
            this.tache = tache;
    }

    public synchronized void travailler(CuisinierBis autre) {
        for(int i=0; i<10; i++) {
            System.out.println(tache);
        }
        fini=true;
        if(autre.asTuFini()) {
            System.out.println("C'est bon pour moi");
        }
    }

    private boolean asTuFini() {
        return fini;
    }
}
