package secao08;

// Aula sobre secao08.Objetos
// secao08.Objetos:
    /*
        - São os produtos/instâncias da classe
     */
@SuppressWarnings("ALL")
public class Objetos {
    public static void main(String[] args) {
        int numero = 4;

        // Declaração de um objeto
        Produto p0;

        // Declaração e instanciação/inicialização do Objeto (p1 -> produto1)
        // p1 -> instância do objeto - ou somente "objeto" - da classe secao08.Produto
        Produto p1 = new Produto(); // secao08.Construtor
        p1.nome = "Notebook";
        p1.preco = 2.367f;
        p1.desconto = 15.0f;

        System.out.println("=========== Produtos ===========");
        System.out.println(p1.nome);
        System.out.println("R$ " + p1.preco);
        System.out.println(p1.desconto + "%");

        p0 = new Produto(); // secao08.Construtor
        p0.nome = "Caneta Bic";
        p0.preco = 2.45f;
        p0.desconto = 5;

        System.out.println();
        System.out.println(p0.nome);
        System.out.println("R$ " + p0.preco);
        System.out.println(p0.desconto + "%");
        System.out.println();

        Pessoa pessoa1 = new Pessoa(); // secao08.Construtor
        pessoa1.nome = "Felipe Duan";
        pessoa1.email = "hugostoso@gmail.com";
        pessoa1.ano_nascimento = 2005;

        System.out.println("=========== Pessoas ===========");
        System.out.println("Nome: " + pessoa1.nome);
        System.out.println("Email: " + pessoa1.email);
        System.out.println("Ano de Nascimento: " + pessoa1.ano_nascimento);


    }
}
