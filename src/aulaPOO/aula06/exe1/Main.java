package aulaPOO.aula06.exe1;

public class Main {
    public static void main(String[] args) {
        // Instânciando Objetos
        Pessoa pessoa = new Pessoa();
        Estudante aluno = new Estudante("Felipe Duan", "Engenharia de Software");

        pessoa.nome = "Adryan Ryan";

        // Métodos
        aluno.info();
        pessoa.info();

    }
}
