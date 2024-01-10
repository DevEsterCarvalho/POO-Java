/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula11poo;

/**
 *
 * @author ester
 */
public class Tecnico extends Aluno {
    private String registroProfissional;
    
    public void praticar(){
        System.out.println("O aluno está praticando e indo bem nas avaliações");
    }
    
    public void setRegistroProfissional (String registroProfissional){
        this.registroProfissional = registroProfissional;
    }
    
    public String getRegistroProfissional (){
        return registroProfissional;
    }
}
