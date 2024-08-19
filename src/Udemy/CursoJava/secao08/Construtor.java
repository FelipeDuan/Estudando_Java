package Udemy.CursoJava.secao08;

// Aula sobre Udemy.CursoJava.secao08.Construtor
// Udemy.CursoJava.secao08.Construtor:
    /*
        - O Udemy.CursoJava.secao08.Construtor de uma classe SEMPRE tem o mesmo nome da classe
        - Por padrão, a JVM cria, em tempo de execução, um construtor padrão,
        também chamado de construtor vazio (não recebe nenhum parâmetro de entrada)
        - Podemos ter mais de um construtor na classe

     */
public class Construtor {
    public static void main(String[] args) {
        // Udemy.CursoJava.secao08.Pessoa 1
        Pessoa pessoa1 = new Pessoa(); // (Método) Udemy.CursoJava.secao08.Construtor

        pessoa1.nome = "Felicity Jones";
        pessoa1.email = "felicity@gmail.com";
        pessoa1.ano_nascimento = 1986;

        pessoa1.imprimir();

        //Udemy.CursoJava.secao08.Pessoa 2
        Pessoa pessoa2 = new Pessoa("Luis Eduardo", "luis_edu@gmail.com", 2010);

        // Instância e método da instância
        pessoa2.imprimir();
    }

}
