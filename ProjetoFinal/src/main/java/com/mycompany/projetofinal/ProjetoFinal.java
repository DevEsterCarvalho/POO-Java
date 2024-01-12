/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projetofinal;

/**
 *
 * @author ester
 */
public class ProjetoFinal {

    public static void main(String[] args) {
        Video v[]= new Video[3];
        v[0] = new Video ("Aula 1 de POO");
        v[1] = new Video ("Aula 12 de Java");
        v[2] = new Video ("Aula 3 Java-POO");
        
        Aluno a[]= new Aluno [2];
        a[0] = new Aluno ("Ester", 22, "F", "ester1", 0);
        a[1] = new Aluno ("Creuza", 12, "F", "creuza 1",0); 
        
        Visualizacao vis [] = new Visualizacao[5];
        vis[0] = new Visualizacao (a[0], v[2]); // aluna Ester assiste Java-POO
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
        vis[1] = new Visualizacao (a[0], v[1]); // aluna Ester assiste Java
        vis[0].avaliar(35.0f);
        System.out.println(vis[0].toString());
        
        /*System.out.println(v[0].toString());
        System.out.println(a[0].toString());*/
    }
}
