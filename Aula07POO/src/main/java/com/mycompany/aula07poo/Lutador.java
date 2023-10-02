/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula07poo;

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
    private int vitorias;
    private int derrotas;
    private int empates;
    
    public Lutador (String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this. idade = id;
        this. altura = al;
        this.peso = pe;
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }
    
    public String getNome (){
        return nome;
    }
    
    public void setNome(String no){
        nome = no;
    }
    
    public String getNacionalidade(){
        return nacionalidade;
    }
    
    public void setNacionalidade (String na) {
        nacionalidade = na;
    }
    
    public int getIdade (){
        return idade;
    }
    
    public void setIdade (int id){
        idade = id;
    }
    
    public float getAltura(){
        return altura;
    }
    
    public void setAltura (float al){
        altura = al;
    }
    
    public float getPeso (){
        return peso;
    }
    
    public void setPeso (String pe){
        peso = pe;
        setCategoria();
    }
    
    public String getCategoria (){
        return categoria;
    }
    
    public void setCategoria (){
        if (peso < 52.2) {
            categoria = "Inválido"; 
            else if (peso  <= 70.3){
              categoria = "Leve";
              else if (peso <= 83.9){
                categoria = "Médio";
                else if (peso  <= 120.2){
                    categoria = "Pesado";
                    }
                }
            }
        }
    }
    
    public int getVitorias(){
        return vitorias;
    }
    
    public void setVitorias(int vi){
        vitorias = vi;
    }
    
    public int getDerrotas(){
        return derrotas;
    }
    
    public void setDerrotas (int de){
        derrotas = de;
    }
    
    public int getEmpates(){
        return empates;
    }
    
    public void setEmpates (int em){
        empates = em;
    }
}   

