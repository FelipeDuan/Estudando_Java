package aulaPOO.aula06.exe1;

public class Estudante extends Pessoa{
    public  String curso;

    public Estudante(String nome, String curso) {
        super.nome = nome;
        this.curso = curso;
    }

    public void info(){
        super.info();
        System.out.println(", e sou estudante de " + curso);
    }
}
