package secao03;// Programa que peça ao usuário para digitar um número. Se esse número for positivo,
//calcule a raiz quadrada do número. Se o número for negativo, mostre uma mensagem dizendo
//que o número é inválido.

import java.util.Scanner;

public class Exe05 {
    public static void main(String[] args) {
        // Objeto Scanner
        Scanner teclado = new Scanner(System.in);

        // Variáveis
        int numero;

        System.out.println("Olá, vamos calcular a raiz quadrada de um número inteiro");

        // Recebendo dados
        System.out.print("Informe um número inteiro: ");
        numero = teclado.nextInt();

        //Verificação do número
        if (numero > 0) {
            // Calculando a raiz quadrada
            double raizQuadrada = Math.sqrt(numero);

            System.out.printf("A raiz do número %d é: %.2f", numero, raizQuadrada);
        } else {
            System.out.println("O número que você inseriu é inválido para este cálculo");
        }
    }
}
