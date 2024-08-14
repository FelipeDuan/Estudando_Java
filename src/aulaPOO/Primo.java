package aulaPOO;

import java.util.Scanner;

// Programa para verificar um número primo
public class Primo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, contador = 0, i = 1;

        // Recebendo número
        System.out.print("Informe um número: ");
        numero = Integer.parseInt(teclado.nextLine());

        // Verificando se é primo
        /*
        Recurso Técnico Alternativo:

            try {
                for (int i = numero; contador < 3; i--) {
                    if (numero % i == 0) {
                        System.out.println("Seu número é divisível por " + i);
                        contador += 1;
                    }
                }
            } catch (ArithmeticException e) {
                System.out.println("Seu número "+ numero + " é primo!");
            }

         */

        // Forma correta
        while (contador < 3 && i<= numero) {
            if (numero % i == 0) {
                System.out.println("Seu número é divisível por " + i);
                contador++;
            }
            i++;
        }

        if (contador < 3) {
            System.out.println("O número " + numero + " é primo!");
        } else {
            System.out.println("O número "+ numero + " não é primo!");
        }
    }
}
