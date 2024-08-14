package aulaPOO;

import java.util.Scanner;

public class Paridade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        // Recebendo o número
        System.out.println("Olá, vamos verificar se o seu número é par ou ímpar!");
        System.out.print("Primeiro, digite um número: ");
        numero = Integer.parseInt(teclado.nextLine());

        // Verificando se é par ou ímpar
        if (numero % 2 == 0) {
            System.out.printf("Que legal, o número %d é par", numero);
        } else {
            System.out.printf("Bacana, o número %d é impar", numero);
        }

        teclado.close();
    }
}
