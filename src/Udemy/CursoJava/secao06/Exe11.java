package Udemy.CursoJava.secao06;

import java.util.Scanner;

// Programa que leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10
// ela possui
@SuppressWarnings("ALL")
public class Exe11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i, j;
        int contador = 0;
        int matriz[][] = new int[3][3];


        // Guardando os valores da matriz
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor da matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = Integer.parseInt(teclado.nextLine());
            }
        }

        // Comparando com 10
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++)
                if (matriz[i][j] > 10) {
                    System.out.println("O número " + matriz[i][j] + " é maior do que 10");
                    contador = contador + 1;
                }
        }

        System.out.printf("Portanto, existem %d maiores que 10", contador);

        teclado.close();
    }
}
