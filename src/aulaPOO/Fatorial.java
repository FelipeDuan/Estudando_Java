package aulaPOO;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, resultado = 1;

        // Recebendo número
        System.out.print("Informe um número: ");
        numero = Integer.parseInt(teclado.nextLine());

        // Calculando fatorial
        for (int i = numero; i > 1 ; i--) {
            // resultado = resultado * i;
            resultado *= i;
        }

        // Imprimindo Fatorial
        System.out.println("O fatorial de " + numero + " é: "+ resultado);

        teclado.close();
    }
}
