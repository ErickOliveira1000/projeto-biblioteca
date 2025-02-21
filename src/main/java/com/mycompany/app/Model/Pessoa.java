package com.mycompany.app.Model;

public class Pessoa {

    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private Livro[] listaLivros;

    public Livro[] getLivros() {
        return listaLivros;
    }

    public void setLivros(Livro[] listaLivros) {
        this.listaLivros = listaLivros;
    }

}
