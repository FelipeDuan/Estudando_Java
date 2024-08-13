package secao06;

import java.util.Scanner;

@SuppressWarnings("ALL")
public class Exe12 {
    public static void main(String[] args) {
        // Variáveis e matrizes
        Scanner teclado = new Scanner(System.in);
        int i, j;
        int x; // = (int) Math.round(Math.random()*100);
        int[][] matriz = new int[5][5];
        int encontrado = 0;

        // Guardando os valores da matriz
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor da matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = Integer.parseInt(teclado.nextLine());
            }
        }


        // O valor X
        System.out.print("O valor x é: ");
        x = Integer.parseInt(teclado.nextLine());

        // Busca pela matriz
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++)
                if (x == matriz[i][j]) {
                    System.out.println("Opa, o valor x está na posição matriz[" + i + "][" + j + "] = "  + matriz[i][j]);
                    encontrado = 1;
                }
        }

        if (encontrado < 1) {
            System.out.println("Infelizmente, o valor x não foi encontrado");
        }

        teclado.close();
    }
}
