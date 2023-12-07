package com.mycompany.aula09poo;

/**
 *
 * @author ester
 */
public class Livro {
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int pagAtual;
    private boolean aberto;
    private String leitor;
    
    
    public void detalhes (){
        
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public int getTotalPaginas(){
        return totalPaginas;
    }
    
    public void setTotalPaginas (int totalPaginas){
        this.totalPaginas = totalPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public String getLeitor() {
        return leitor;
    }

    public void setLeitor(String leitor) {
        this.leitor = leitor;
    }
    
    
}
