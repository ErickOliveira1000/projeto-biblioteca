package com.mycompany.app.Model;

public class Usuario extends Pessoa {
    private int idade;
    private Emprestimo[] historicoEmprestimos;

    // Construtor com nome, idade e histórico de empréstimos
    public Usuario(String nome, int idade) {
        super(nome); // Chama o construtor da classe Pessoa para inicializar o nome
        this.idade = idade;
    }
    
    // Getters e Setters 

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Emprestimo[] getHistoricoEmprestimos() {
        return historicoEmprestimos;
    }

    public void setHistoricoEmprestimos(Emprestimo[] historicoEmprestimos) {
        this.historicoEmprestimos = historicoEmprestimos;
    }

}

