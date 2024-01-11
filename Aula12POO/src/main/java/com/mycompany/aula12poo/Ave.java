
package com.mycompany.aula12poo;


public class Ave extends Animal {
    private String corPena;
    
    public void fazerNinho(){
        System.out.println("Fazendo um ninho");
    }
    
    @Override
    public void locomover(){
        System.out.println("Voando...");
    }
    
    @Override
    public void Alimentar() {
        System.out.println("Comendo frutas");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Som de ave");
    }
    
    public void setCorPena(String corPena){
        this.corPena = corPena;
    }
    
    public String getCorPena(){
        return corPena;
    }
}
