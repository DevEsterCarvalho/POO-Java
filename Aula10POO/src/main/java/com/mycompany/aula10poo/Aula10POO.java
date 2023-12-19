/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aula10poo;

/**
 *
 * @author ester
 */
public class Aula10POO {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Cláudio");
        p4.setNome("Fabiana");
        
        p2.setCurso ("Informática");
        p3.setSalario (2500.75f);
        p4.setSetor ("Estoque");
        
        //p1.receberAumento ("550.20");
        //p2.mudarTrabalho ();
        //p4.cancelarMatricula();
        
        
    }
}
