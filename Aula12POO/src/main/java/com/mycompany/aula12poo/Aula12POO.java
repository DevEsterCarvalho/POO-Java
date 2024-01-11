
package com.mycompany.aula12poo;


public class Aula12POO {

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro d = new Cachorro(); // d dog
        Cobra s = new Cobra(); // s snake
        Tartaruga t = new Tartaruga();
        Arara l = new Arara //l lory (variedade de papagaio inglês
        GoldFish g = new GoldFish();
        
     
     m.setPeso(35.3f);
     m.setCorPelo ("Marrom");
     m.alimentar();
     m.locomover();
     
     r.locomover();
     p.locomover();
     a.locomover();
     g.locomover();
     l.fazerNinho();
     g.Alimentar();
     t.locomover();
     d.emitirSom(); 
     c.locomover();
     s.alimentar();
     
    }
}
