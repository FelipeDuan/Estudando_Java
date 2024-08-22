package aulaPOO.aula3;

public class Pessoa {
    int idade;
    String nome;
    String cidade;

    public Pessoa(String nome, int idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    public void imprimir() {
        System.out.println("-> Nome: " + this.nome);
        System.out.println("-> Idade: " + this.idade);
        System.out.println("-> Cidade: " + this.cidade);
        System.out.println();
    }

    public void fazerAniversario() {
        System.out.println(this.nome + " fez aniversário!");
        this.idade += 1;
        System.out.println();
    }
}
