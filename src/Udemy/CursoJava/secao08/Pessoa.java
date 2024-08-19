package Udemy.CursoJava.secao08;

// Aula sobre Classes, Atributos e Construtores
// Udemy.CursoJava.secao08.Construtor:
    /*
        - Sempre terá seguinte forma:

        public NomeDaClasse() {

        }

     */
public class Pessoa {
    String nome, email;
    int ano_nascimento;

    // Udemy.CursoJava.secao08.Construtor Vazio
    public Pessoa() {}


    // Udemy.CursoJava.secao08.Construtor com parâmetros (recebe os atributos da classe)
    public Pessoa(String nome, String email, int ano_nascimento) {
        // this == Nesse objeto, nesse atributo, faça tal coisa...
        this.nome = nome;
        this.email = email;
        this.ano_nascimento = ano_nascimento;
    }

    void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
        System.out.println("Ano de Nascimento: " + this.ano_nascimento);
        System.out.println();
    }
}
