/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula07poo;

import java.util.HashSet;

/**
 *
 * @author ester
 */
    public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura, peso;
    private String categoria;
    private int vitorias, derrotas, empates;
   
    
    //método construtor
    public Lutador (String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this. idade = id;
        this. altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }
    
    //métodos especiais getters e setters
    public String getNome (){
        return nome;
    }
    
    public void setNome(String no){
        this.nome = no;
    }
    
    public String getNacionalidade(){
        return nacionalidade;
    }
    
    public void setNacionalidade (String na) {
        this.nacionalidade = na;
    }
    
    public int getIdade (){
        return idade;
    }
    
    public void setIdade (int id){
        this.idade = id;
    }
    
    public float getAltura(){
        return altura;
    }
    
    public void setAltura (float al){
        this.altura = al;
    }
    
    public float getPeso (){
        return peso;
    }
    
    public void setPeso (float peso){
        this.peso = peso;
        this.setCategoria();
    }
    
    public String getCategoria (){
        return categoria;
    }
    
    private void setCategoria (){
        if (this.peso < 52.2) {
            this.categoria = "Inválido"; 
        } else if (this.peso  <= 70.3){
            this.categoria = "Leve";
        }else if (this.peso <= 83.9){
            this.categoria = "Médio";
        }else if (peso  <= 120.2){
            this.categoria = "Pesado";
        }else {
            this.categoria = "Inválido";
        }     
    }
    
    
    public int getVitorias(){
        return vitorias;
    }
    
    public void setVitorias(int vi){
        this.vitorias = vi;
    }
    
    public int getDerrotas(){
        return derrotas;
    }
    
    public void setDerrotas (int de){
       this.derrotas = de;
    }
    
    public int getEmpates(){
        return empates;
    }
    
    public void setEmpates (int em){
        this.empates = em;
    }
    
    public void ganharLuta(){
        this.setVitorias (this.getVitorias () + 1);
    }
    
    public void perderLuta(){
        this.setDerrotas (this.getDerrotas () + 1);
    }
    
    public void empatarLuta(){
        this.setEmpates (this.getEmpates () + 1);
    }
    
    public void apresentar(){
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(this.getIdade() + "anos");
        System.out.println(this.getAltura() + "m de altura");
        System.out.println("Pesando: " + this.getPeso()+ "kgs");
        System.out.println("Ganhou: " + this.getVitorias() + " lutas");
        System.out.println("Perdeu: " + this.getDerrotas() + " lutas");
        System.out.println("Empatou: " + this.getEmpates() + " lutas");
        System.out.println("-------------------------");
    }
    
    public void status(){
        System.out.println(this.getNome());
        System.out.println("É um peso " + this.getCategoria());
        System.out.println("Com: " + this.getVitorias() + " vitórias");
        System.out.println("Com: " + this.getDerrotas() + " derrotas");
        System.out.println("Com: " + this.getEmpates() + " empates");
    }
}   

