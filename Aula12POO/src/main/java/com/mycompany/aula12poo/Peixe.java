
package com.mycompany.aula12poo;


public class Peixe extends Animal {
    private String corEscama;
    
    public void soltarBolhar(){
        System.out.println("Soltando bolha...");
    }
    
    @Override
    public void locomover(){
        System.out.println("Nadando...");
    }
    
    @Override
    public void Alimentar() {
        System.out.println("Comendo substâncias");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Peixe não faz som");
    }
    
    
    public void setCorEscama (String corEscama){
        this.corEscama = corEscama;
    }
    
    public String getCorEscama(){
        return corEscama;
    }

    
}

