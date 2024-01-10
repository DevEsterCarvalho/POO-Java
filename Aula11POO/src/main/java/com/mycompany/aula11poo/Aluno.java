/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula11poo;

/**
 *
 * @author ester
 */
public class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    public void pagarMensalidade (){
        System.out.println("Pagando mensalidade do aluno " + this.nome);
    }
    
    public void setMatricula (int matricula){
        this.matricula = matricula;
    }
    
    public int getMatricula(){
         return matricula;
    }
    
    public void setCurso ( String curso){
        this.curso = curso;
    }
    
    public String getCurso(){
        return curso;
    }
}
