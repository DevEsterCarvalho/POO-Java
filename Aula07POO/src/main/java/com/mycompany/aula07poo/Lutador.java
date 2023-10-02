/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula07poo;

import java.util.HashSet;
import java.util.Set;

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
                    else {
                        categoria = "Inválido";
                        }
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
        System.out.println("Pesando: " + this.getPeso());
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpates());
    }
    
    public void status(){
        System.out.println(this.getNome());
        System.out.println("É um peso " + this.getCategoria());
        System.out.println(this.getVitorias() + " vitórias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
    }
}   

