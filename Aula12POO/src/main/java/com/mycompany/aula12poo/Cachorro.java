
package com.mycompany.aula12poo;


public class Cachorro extends Mamifero {
    public void enterrarOsso(){
        System.out.println("Enterrando osso");
    }
    
    public void abanarRabo(){
        System.out.println("Abanando");
       
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Latindo");
    }
}
