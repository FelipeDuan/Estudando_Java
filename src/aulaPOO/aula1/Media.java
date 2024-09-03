package aulaPOO.aula1;

import java.util.ArrayList;
import java.util.Scanner;

// Programa que faz a média das notas
public class Media {
    public static void main(String[] args) {
            ArrayList<Nota> notas = new ArrayList<>();
            Scanner teclado = new Scanner(System.in);
            int qtd;
            double nota, soma = 0, media;

            System.out.print("Informe o número de notas que deseja para calcular a média: ");
            qtd = Integer.parseInt(teclado.nextLine());

            // Recebendo as notas
            for (int i = 0; i < qtd; i++) {
                System.out.printf("Informe a nota %d: ", (i + 1));
                nota = Double.parseDouble(teclado.nextLine());

                // Calculando a soma das notas do array
                soma += nota;

                notas.add(new Nota(nota));
            }

            // Cálculando a média
            media = soma / notas.size();

            // Imprimindo média:
            System.out.println("A média das notas é: " + soma + " / " + notas.size() + " = " + media);

            teclado.close();
    }
}
