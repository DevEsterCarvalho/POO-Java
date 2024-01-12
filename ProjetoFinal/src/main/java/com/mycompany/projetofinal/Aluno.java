/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetofinal;

/**
 *
 * @author ester
 */
public class Aluno extends Pessoa{
    private String login;
    private int totAssistido;
    
    public Aluno (String nome, int idade, String sexo, String login, int experiencia){
        super(nome, idade, sexo, experiencia);
        this.login = login;
        this.totAssistido = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Aluno{" + super.toString() + "login=" + login + ", totAssistido=" + totAssistido + '}';
    }
    
    
}
