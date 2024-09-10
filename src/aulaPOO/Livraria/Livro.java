package aulaPOO.Livraria;

import static aulaPOO.Livraria.Main.livros;
import static aulaPOO.Livraria.Main.teclado;

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

    static void cadastar() {
        int qtd;
        String nome, autor, cor, idade;

        // Cadastrando livros
        System.out.println("Olá, bem vindo ao sistema de Cadastro e Impressão da biblioteca!");
        System.out.println("Quantos Livros você deseja cadastrar?");
        qtd = Integer.parseInt(teclado.nextLine());
        System.out.println();

        for (int i = 0; i < qtd; i++) {
            System.out.printf("Informe o nome do livro %d: ", i+1);
            nome = teclado.nextLine();

            System.out.printf("Informe o nome do autor %d: ", i+1);
            autor = teclado.nextLine();

            System.out.printf("Informe a cor do livro %d: ", i+1);
            cor = teclado.nextLine();

            System.out.printf("Informe a faixa etária (idade recomendada) do livro %d: ", i+1);
            idade = teclado.nextLine();
            System.out.println();

            // Declarando e Instânciando Objeto
            livros.add(new Livro(nome, autor, cor, idade));
        }
    }

    static void detalhesLivros() {
        // Imprimindo dados dos Livros
        System.out.println("================ Livros =================");
        System.out.println("-> Quantidade cadastrada: " + livros.size());
        System.out.println();

        for (int i = 0; i < livros.size(); i++) {
            System.out.println("-> Nome do livro " + (i+1) + " : " + livros.get(i).getNome());
            System.out.println("-> Autor do livro " + (i+1) + " : " + livros.get(i).getAutor());
            System.out.println("-> Cor do livro " + (i+1) + " : " + livros.get(i).getCor());
            System.out.println("-> Idade recomendada do livro " + (i+1) + " : " + livros.get(i).getFaixa_idade());
            System.out.println();
        }
    }

}
