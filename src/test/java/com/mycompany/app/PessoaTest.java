package com.mycompany.app;

import org.junit.Test;

import com.mycompany.app.Interface.Pessoavel;
import com.mycompany.app.Model.Autor;
import com.mycompany.app.Model.Livro;
import com.mycompany.app.Model.Pessoa;

import static org.junit.Assert.*;

public class PessoaTest {
    @Test
    public void testGetNome() {
        // Cria uma instância da classe Pessoa
        Pessoavel pessoa = new Pessoa("Jess");
        // Atribuir um nome para a pessoa
        pessoa.setNome("Jess");
        // Verifica se o nome retornado é o mesmo que foi setado
        assertEquals("Jess", pessoa.getNome());
    }
    @Test
    public void testSetNome() {
    // Cria uma instância da classe Pessoa
        Pessoavel pessoa = new Pessoa("Jess");
        // Define um nome para a pessoa
        pessoa.setNome("Jess");
        // Verifica se o nome retornado é o mesmo que foi setado
        assertEquals("Jess", pessoa.getNome());
    }
    //@Test
    
    @Test
    public void testGetLivros() {
    // Cria uma instância da classe Pessoa e da classe Autor
        Pessoa pessoa = new Pessoa("Jess");
        Autor autor = new Autor("Jess","Brasileira");


        // Define uma lista de livros para a pessoa
        Livro[] livros = new Livro[2];
        livros[0] = new Livro("Java Basico", autor, "tecnologia", true);
        livros[1] = new Livro("Java Avançado", autor,"tecnologia", true);
        pessoa.setLivros(livros);

        // Verifica se a lista de livros retornado é a mesma que foi definida
        assertArrayEquals(livros, pessoa.getLivros());
    }
}


//instancia de pessoa com um nome

//getNome
//retorna o nome da pessoa
//comparar com o nome que passei no setNome

//setNome 
//atribuir um valor para a propriedade nome
//comparar se o valor do getNome e o mesmo valor que passamos no setNome

//getLivros
//atribuir uma lista de livros para uma pessoa
//comparar se a lista retornada é a mesma lista que passamos para o setLivros

//setLivros
//atribuir uma lista de livros para uma pessoa
//comparar se o valor do getLivros é a mesmo valor que passamos no setLivros