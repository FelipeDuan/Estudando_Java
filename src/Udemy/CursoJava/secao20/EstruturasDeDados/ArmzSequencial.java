package Udemy.CursoJava.secao20.EstruturasDeDados;
// Aula sobre Armazenamento Sequencial
/*
    - Armazenamento Sequencial:
        int[] numeros = new int[5];

        numeros[0] = 1;
        numeros[1] = 3;
        numeros[2] = 5;
        numeros[3] = 7;
        numeros[4] = 9;

    Ao criar um array de inteiros, automaticamente todas as posições são preenchidas com 0, até que o valor
    seja trocado
 */
public class ArmzSequencial {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Felipe Duan");
        Aluno a2 = new Aluno("Duany Dreyton");

        Vetor lista = new Vetor();

        System.out.println("Total de alunos: " + lista.tamanho());

        lista.adicionar(a1);
        System.out.println("Total de alunos: " + lista.tamanho());

        lista.adicionar(a2);
        System.out.println("Total de alunos: " + lista.tamanho());

        System.out.println(lista);

        System.out.println(lista.contem(a1));
    }
}
