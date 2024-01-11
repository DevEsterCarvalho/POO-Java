
package com.mycompany.aula12poo;


public class Mamifero extends Animal {
    private String corPelo;
    
    public void setCorPelo (String corPelo){
        this.corPelo = corPelo;
    }
    
    public String getCorPelo(){
        return corPelo;
    }
    
    @Override
    public void locomover(){
        System.out.println("Correndo...");
    }
    
    @Override
    public void Alimentar() {
        System.out.println("Mamando");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("som de mamífero");
    }

    void alimentar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
