package Udemy.CursoJava.secao02;// Programa que pede para o usuário digitar um número real e imprime o quadrado dele
import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float num, quadrado;

        // Recebendo o número real
        System.out.println("Digite um número real: Ex. 1, 2, '4,5', etc...");
        System.out.print("Seu número é: ");
        num = teclado.nextFloat();
        // Poderia ser utilizado também: Float.parseFloat(teclado.nextLine());
        // Esta outar forma é utilizada para ter um maior controle sobre a entrada de dados, sendo bem mais flexível
        // Além disso, é ótima para trabalhar com uma entrada mista de dados, como números e letras

        // Cálculo
        quadrado = num * num;

        // Imprimindo o resultado
        System.out.printf("\nO quadrado do número %.2f é: %.2f", num, quadrado);
    }
}
