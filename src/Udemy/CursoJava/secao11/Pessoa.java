package Udemy.CursoJava.secao11;

/*
    - Classe base / Classe mãe / Classe pai / Super classe / Classe genérica
 */

// Agora como classe Abstrata
/*
    - Desta forma, se impossibilita a criação de objetos desta classe
 */
@SuppressWarnings("ALL")
public abstract class Pessoa {
    // Private para maior segurança (Manipuláveis apenas na própria classe)
    private String nome;
    private int ano_nascimento;
    private String email;

    // Sobrecarga de Method nos Construtores
    // Construtor Vazio
    public Pessoa() {

    }

    // Construtor com Parâmetros
    public Pessoa(String nome, int ano_nascimento, String email) {
        this.nome = nome;
        this.ano_nascimento = ano_nascimento;
        this.email = email;
    }

    // Get - Retornar o Nome, pois o atributo é privado
    public String getNome() {
        return this.nome;
    }

    // Set - Não apresenta retorno (void), ele seta algum valor, para alterar o atributo
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno_nascimento() {
        return this.ano_nascimento;
    }

    public void setAno_nascimento(int ano_nascimento) {
        this.ano_nascimento = ano_nascimento;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Esse símbolo ao lado indica que o method abaixo é herdado da classe Object
    // Overriding / Sobrescrita de Method
    public String toString() {
        return "Nome: " + this.nome + " / Ano Nascimento: "+ this.ano_nascimento;
    }

    // Overloading / Sobrecarga de Method
    // Mesma classe, métodos com mesmo nome, mas com comportamento diferente (alterando os parâmetros de entrada)
    public void mensagem() {
        System.out.println("Está é minha mensagem...");
    }

    public void mensagem(String msg) {
        System.out.println(msg);
    }

    public void mensagem(String msg, int num) {
        System.out.println(msg + num);
    }

    // Method Abstrato
    // Estrutura: public abstract tipo nome();
    public abstract void outra_mensagem(String texto);
}
