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
        Visitante v1 = new Visitante ();
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
        
        Bolsista b1 = new Bolsista ();
        b1.setMatricula (333);
        b1.setNome("Rafaela");
        b1.setBolsa(12.5f);
        b1.setSexo ("Feminino");
        b1.pagarMensalidade();
        
    }
}
