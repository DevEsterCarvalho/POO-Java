/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula12poo;

/**
 *
 * @author ester
 */
public class Reptil extends Animal{
    private String corEscama;
    
    @Override
    public void locomover(){
        System.out.println("Rastejando...");
    }
    
    @Override
    public void Alimentar() {
        System.out.println("Comendo insetos e vegetais");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Som de réptil");
    }
    
    public void setCorEscama (String corEscama){
        this.corEscama = corEscama;
    }
    
    public String getCorEscama(){
        return corEscama;
    }
}
