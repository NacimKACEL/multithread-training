package com.finaxys.thread;

public class Personne {
    private String nom;
    
    public Personne(String nom) { this.nom=nom;}
    public String getNom() { return nom;}
  // public void setNom(String nom) {
  //      this.nom=nom;
  // }
    
    public Personne remplaceNom(String nom) {
        return new Personne(nom);
    }
}
