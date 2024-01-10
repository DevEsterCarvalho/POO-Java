/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aula11poo;

/**
 *
 * @author ester
 */
public class Aula11POO {

    public static void main(String[] args) {
        /*Visitante v1 = new Visitante ();
        v1.setNome ("Julia");
        v1.setIdade (20);
        v1.setSexo ("Feminino");
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome ("Pedro");
        a1.setMatricula (222);
        a1.setCurso ("Análise e Desenvolvimento de Sistemas");
        a1.setSexo ("Masculino");
        a1.setIdade (21);
        a1.pagarMensalidade();
        System.out.println(a1.toString());
        
        Bolsista b1 = new Bolsista ();
        b1.setMatricula (333);
        b1.setNome("Rafaela");
        b1.setBolsa(12.5f);
        b1.setSexo ("Feminino");
        b1.pagarMensalidade();
        System.out.println(b1.toString());
                
        Professor p1 = new Professor ();
        p1.setEspecialidade ("Geografia");
        p1.setNome("Júlio");
        p1.setSalario (8.000f);
        p1.setSexo ("Masculino");
        p1.setIdade (37);
        p1.receberAumento ();
        System.out.println(p1.toString());
        */
        
        Tecnico t1= new Tecnico();
        t1.setMatricula (444);
        t1.setNome ("Barbára");
        t1.setCurso ("Sistemas de informação");
        t1.praticar();
        System.out.println(t1.toString());
    }
    
    
}
