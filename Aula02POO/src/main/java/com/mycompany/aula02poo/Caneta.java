/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula02poo;

/**
 *
 * @author ester
 */
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    public void status (){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga atual: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }
           
    public void rabiscar (){
        if (this.tampada == true){
            System.out.println("Não posso rabiscar");
        } else {
            System.out.println("Estou rabiscando");  
        }
    }
    public void tampar (){
        this.tampada = true;
    }
    public void destampar (){
        this.tampada = false;
    }
}
