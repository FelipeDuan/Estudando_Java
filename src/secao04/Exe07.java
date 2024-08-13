package secao04;

// Programa que determine e mostre os cinco primeiros múltiplos de 3, considerando
//números maiores que 0.
public class Exe07 {
    public static void main(String[] args) {
        int numero = 0;

        // Minha solução
        /*
        for (int i = 0; i < 5; i++) {
            numero = numero + 3;
            System.out.printf("O %dº número multiplo de 3 é: %d\n", i + 1, numero);

        }
         */

        // Solução Alternativa
        for ( int i = 1; numero < 5; i++) {
            if (i % 3 == 0) {
                System.out.println("O número " + i + " é multiplo de 3.");
                numero += 1;
            }
        }
    }
}
