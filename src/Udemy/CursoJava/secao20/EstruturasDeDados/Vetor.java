package Udemy.CursoJava.secao20.EstruturasDeDados;

import java.util.Arrays;

public class Vetor {
    private Aluno alunos[] = new Aluno[100];
    private int total = 0;

    public void adicionar(Aluno aluno) {
        // Recebe um Aluno e coloca no Vetor
        this.alunos[total] = aluno;
        total++;
    }

    public Aluno pegar(int posicao) {
        // Recebe uma posição e devolve o aluno
        return this.alunos[posicao];
    }

    public void remover(int posicao) {
        // Remove aluno pela posição
        this.alunos[posicao] = null;
    }

    public boolean contem(Aluno aluno) {
        // Descobre se o aluno está ou não na lista
        for (int i = 0; i < alunos.length; i++) {
            if (alunos.equals(alunos[i])) {
                return true;
            }
        }
        return false;
    }

    public int tamanho() {
        // Devolve a quantidade de Alunos no vetor
        return this.total;
    }

    @Override
    public String toString() {
        // Facilita a visualização do Array
        return "Vetor{ " +
                "alunos = " + Arrays.toString(alunos) +
                '}';
    }
}
