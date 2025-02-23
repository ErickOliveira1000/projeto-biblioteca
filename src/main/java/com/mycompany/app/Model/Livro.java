package com.mycompany.app.Model;

public class Livro extends Publicacao{
    private String genero;
    private boolean disponivel;

    // Construtor

    public Livro(String titulo, Autor autor, String genero, boolean disponivel) {
        super(titulo, autor);
        this.genero = genero;
        this.disponivel = disponivel;
    }

    // Getters e Setters

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    // Método validarDisponibilidade

    public void validarDisponibilidade() {
        if (disponivel) {
            System.out.println("O livro está disponível.");
        } else {
            System.out.println("O livro não está disponível.");
        }
    }

    @Override
    public void validarPublicação() {
        // Lógica específica de validação para Livro
        System.out.println("Validando publicação de Livro...");
    }

}
