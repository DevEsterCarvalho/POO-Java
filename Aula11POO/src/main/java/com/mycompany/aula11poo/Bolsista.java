/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula11poo;

/**
 *
 * @author ester
 */
public class Bolsista extends Aluno {
    private float bolsa;
    
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de "+ this.getNome());
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println(this.nome + "é bolsista! Pagamento facilitado");
    }
    
    public void setBolsa (float bolsa){
        this.bolsa = bolsa;
    }
    
    public float bolsa() {
        return bolsa;
    }
}


