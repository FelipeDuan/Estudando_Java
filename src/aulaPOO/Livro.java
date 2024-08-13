package aulaPOO;

public class Livro {
    String nome;
    String autor;
    String cor;
    String faixa_idade;

    // Construtor com parâmetros
    public Livro(String nome, String autor, String cor, String faixa_idade) {
        this.nome = nome;
        this.autor = autor;
        this.cor = cor;
        this.faixa_idade = faixa_idade;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public String getCor() {
        return cor;
    }

    public String getFaixa_idade() {
        return faixa_idade;
    }

}
