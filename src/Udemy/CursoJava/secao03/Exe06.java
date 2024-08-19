package Udemy.CursoJava.secao03;// Programa que peça ao usuário para digitar um número e diga se é par ou ímpar.
import  java.util.Scanner;

public class Exe06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número: ");
        numero = Integer.parseInt(teclado.nextLine());

        if (numero %2 == 0) {
            System.out.printf("O número %d é par", numero);
        } else {
            System.out.printf("O número %d é impar", numero);
        }

        teclado.close();
    }
}
