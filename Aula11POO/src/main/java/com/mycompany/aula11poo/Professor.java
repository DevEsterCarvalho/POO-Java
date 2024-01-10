/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula11poo;


public class Professor extends Pessoa {
    private String especialidade;
    private float salario;
    
    public void receberAumento(){
        this.salario++;
    }
    
    public void setEspecialidade (String especialidade){
        this.especialidade = especialidade;
    }
    
    public String getEspecialidade (){
        return especialidade;
    }
    
    public void setSalario (float salario){
        this.salario = salario;
    }
    
    public float getSalario (){
        return salario;
    }
}


