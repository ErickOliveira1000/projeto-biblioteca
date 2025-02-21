package com.mycompany.app.Model;

public class Autor extends Pessoa {
    private String nacionalidade;
    //private String obrasPublicadas;

    // Construtor com nome e nacionalidade

    public Autor(String nome, String nacionalidade) {
        super(nome);
        //  Chama o construtor da classe Pessoa para inicializar o nome
        this.nacionalidade = nacionalidade;
        //this.obrasPublicadas = obrasPublicadas;
    }
    
    // Getters e Setters

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    //public Livro[] getObrasPublicadas() {
    //    return obrasPublicadas;
    //}

    //public void setObrasPublicadas(Livro[] obrasPublicadas) {
    //    this.obrasPublicadas = obrasPublicadas;
    //}

    public String toString(){
        return this.getNome();
    }

}
