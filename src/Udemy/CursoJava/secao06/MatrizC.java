package Udemy.CursoJava.secao06;
public class MatrizC {
    public static void main(String[] args) {
        // Tamanhos das matrizes
        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][2];
        int[][] mab = new int[3][2];
        int i, j, c;

        // Arrays com os valores
        int[] valoresMa = {3, 2, 3, 2, 2, 3, 4, 3, 5};
        int[] valoresMb = {90, 100, 100, 90, 70, 80};

        // Preenchendo a matriz A com os valores
        c = 0;
        for (i = 0; i < matrizA.length; i++) {
            for (j = 0; j < matrizA[i].length; j++) {
                matrizA[i][j] = valoresMa[c++];
            }
        }

        // Preenchendo a matriz B com os valores
        c = 0;
        for (i = 0; i < matrizB.length; i++) {
            for (j = 0; j < matrizB[i].length; j++) {
                matrizB[i][j] = valoresMb[c++];
            }
        }

        // Multiplicação das matrizes A e B
        for (i = 0; i < mab.length; i++) {
            for (j = 0; j < mab[i].length; j++) {
                mab[i][j] = 0; // Inicializando as posições com 0
                for (int k = 0; k < matrizA[i].length; k++) {
                    mab[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        // Exibindo a matriz A
        System.out.println("MATRIZ A:");
        for (i = 0; i < matrizA.length; i++) {
            for (j = 0; j < matrizA[i].length; j++) {
                System.out.print(matrizA[i][j] + "\t");
            }
            System.out.println();
        }

        // Exibindo a matriz B
        System.out.println("\nMATRIZ B:");
        for (i = 0; i < matrizB.length; i++) {
            for (j = 0; j < matrizB[i].length; j++) {
                System.out.print(matrizB[i][j] + "\t");
            }
            System.out.println();
        }

        // Exibindo o resultado da multiplicação das matrizes
        System.out.println("\nMultiplicação das matrizes (A * B):");
        for (i = 0; i < mab.length; i++) {
            for (j = 0; j < mab[i].length; j++) {
                System.out.print(mab[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
