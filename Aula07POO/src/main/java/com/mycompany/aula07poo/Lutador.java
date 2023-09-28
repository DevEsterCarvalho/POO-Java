/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula07poo;

/**
 *
 * @author ester
 */
p   public class Lutador {
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
        this.peso = this.setPeso (pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }
    
    
}
