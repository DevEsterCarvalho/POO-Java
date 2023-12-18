/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aula09poo;

/**
 *
 * @author ester
 */
public class Aula09POO {

    public static void main(String[] args) {
        Pessoa [] p = new Pessoa [2];
        Livro [] l = new Livro [3];
        
        p[0] = new Pessoa ("Pedro", 22, "M");
        p[1] = new Pessoa ("Joana", 24, "F");
        
        l[0] = new Livro("Apredendo Java", "Jose da Silva", 300, p[0]);
        l[1] = new Livro ("POO para iniciantes", "Pedro Paulo", 500, p[1]);
        l[2] = new Livro ("Java avançado", "Maria Candido", 800, p[0]);
        
        l[0].abrir();
        l[0].folhear(100);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
    }
}
