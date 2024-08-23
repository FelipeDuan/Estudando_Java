package Udemy.CursoJava.secao10;

// Padrão -> Protected / Protegido (Modificador de acesso Default)
/*
    - O modificador de acesso Protected faz com que
    o elemento seja visível somente dentro do mesmo
    pacote em que o elemento foi declarado!
 */

@SuppressWarnings("ALL")
public class Cliente implements Comparable{
    private int idade;
    private String nome, endereco;

    public Cliente(String nome, int idade, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;

        //this.dizer_oi(); -> realiza esse method assim que o objeto é instânciado
    }

    private void dizer_oi() {
        System.out.println(this.nome + " está dizendo oi...");
    }

    public String getNome() {
        return this.nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    @Override
    public String toString() {
        return this.nome;
    }

    @Override
    public int compareTo(Object outro) {
        Cliente aux = (Cliente) outro;
        if (this.idade < aux.idade) {
            return -1;
        } else if (this.idade > aux.idade) {
            return 1;
        } else {
            return 0;
        }
    }
}
