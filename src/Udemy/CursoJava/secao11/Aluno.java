package Udemy.CursoJava.secao11;
/*
        Benefícios da Herança
    - Evita a repetição de código
    - Facilita a manutenção do programa
    - ...

    - Classe Específica / Sub-classe / Classe Filha
    Aluno é uma Pessoa

    - Quando uma classe herda de outra classe ela ganha:
        * Todos os atributos e métodos da classe herdada
 */
@SuppressWarnings("ALL")
public class Aluno extends Pessoa {
    private String ra;


    public Aluno(String nome, int ano_nascimento, String email, String ra) {
        // Pessoa(nome,nascimento, email)
        super(nome, ano_nascimento, email);
        this.ra = ra;
    }

    @Override
    public String getNome() {
        return "Aluno: " + super.getNome();
    }

    public String getRa() {
        return this.ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    @Override
    public String toString() {
        return super.toString() + " / R.A: " + this.ra;
    }

    @Override
    public void outra_mensagem(String texto) {
        System.out.println(texto);
    }
}
