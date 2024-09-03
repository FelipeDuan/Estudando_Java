package aulaPOO.aula05.Avatar;

public class Dobrador {
    public String nome;
    public String nacao;

    public Dobrador(String nome, String nacao) {
        this.nome = nome;
        this.nacao = nacao;
    }

    public void info() {
        System.out.println("=========== Informações do Dobrador ===========");
        System.out.println("-> Nome: " + nome);
        System.out.println("-> Nação: " + nacao);
        System.out.println();
    }

    public void apresentacao() {
        System.out.println(nome + ": Olá, eu sou " + nome + " e sou dobrador da " + nacao);
    }
}
