package secao03;

// Entendendo estruturas de Decisão (If, else, else if)
public class Decisao {
    @SuppressWarnings("ConstantValue")
    public static void main(String[] args) {
        // Declarando e inicializando a variável
        int numero = 2;

        // Se (condição), então... / Se não, então...
        if (numero > 5) {
            System.out.println("O número " + numero + " é maior do que 5");
        } else if (numero == 5) {
            System.out.println("O número " + numero + " é igual do que 5");
        } else if (numero % 2 == 0) { // verificando se o número é par
            System.out.println("O número " + numero + " é par");
        } else {
            System.out.println("O número " + numero + " é menor do que 5");
        }

    }
}
