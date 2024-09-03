package aulaPOO.aula4.EstudandoAcesso;

public class Pessoa {
    // sempre declarar o tipo de acesso
    public String nome;
    private int cpf;
    protected double salario;

    public Pessoa(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void mudarCpf(int cpf) {
        this.cpf = cpf;
    }

    public void informacoes() {
        System.out.println("========== Informações da pessoa ==========");
        System.out.println("-> Nome: " + nome);
        System.out.println("-> Cpf: " + cpf);
        System.out.println("-> Salario: " + salario);
        System.out.println();
    }

    private void aumentarSalario() {
        salario += 500;
    }

    public void subirDeCargo() {
        System.out.println("Parabéns, você subiu de cargo!");
        aumentarSalario();
    }
}
