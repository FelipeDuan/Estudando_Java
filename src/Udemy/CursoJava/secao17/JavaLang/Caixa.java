package Udemy.CursoJava.secao17.JavaLang;

// Caixa de Objetos Genéricos

public class Caixa {
    private Object[] objetos; // Array do tipo Conta
    private int posicaoLivre;

    public Caixa() {
        // Instânciando o array, pode ter até 100 objetos
        objetos = new Object[100];
        posicaoLivre = 0;
    }

    public void adcionar(Object nova) {
        this.objetos[this.posicaoLivre] = nova;
        this.posicaoLivre++;
    }

    public Object pegar(int posicao) {
        return this.objetos[posicao];
    }

}
