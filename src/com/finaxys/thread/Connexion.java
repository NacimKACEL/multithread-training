package com.finaxys.thread;

public class Connexion {
	private static Connexion instance;
    public static Connexion getInstance() {
        if(instance==null)
        synchronized(Connexion.class) {
             if(instance==null)
                  instance = new Connexion();
        }
        
        return instance;
    }
    
    private Connexion() {
        System.out.println("Constructeur de Connexion");
    }
    
    //méthodes d'instance
    public void open() {
        System.out.println("Open ...");
    }
    public void close() {
        System.out.println("Close ...");
    }

}
