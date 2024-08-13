package secao02;// Programa que lê um número inteiro e o imprime
import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        // Recebendo o número
        System.out.print("Informe um número inteiro: ");
        numero = Integer.parseInt(teclado.nextLine());

        // Imprimindo o número
        System.out.printf("O número informado é: %d", numero);

        // Fechando a comunicação do teclado
        teclado.close();
    }
}
