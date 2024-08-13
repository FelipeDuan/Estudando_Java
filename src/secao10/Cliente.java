package secao10;

// Padrão -> Protected / Protegido (Modificador de acesso Default)
/*
    - O modificador de acesso Protected faz com que
    o elemento seja visível somente dentro do mesmo
    pacote em que o elemento foi declarado!
 */

@SuppressWarnings("ALL")
public class Cliente {
    private String nome, endereco;

    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;

        this.dizer_oi();
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
}
