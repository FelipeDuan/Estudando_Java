package Udemy.CursoJava.secao06;

public class MultiMatrizes {
    public static void main(String[] args) {
        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][2];
        int[] valoresMa = {3, 2, 3, 2, 2, 3, 4, 3, 5};
        int[] valoresMb = {90, 100, 100, 90, 70, 80};

        preencherMatriz(matrizA, valoresMa);
        preencherMatriz(matrizB, valoresMb);

        int[][] resultado = multiplicarMatrizes(matrizA, matrizB);

        exibirMatriz("MATRIZ A", matrizA);
        exibirMatriz("MATRIZ B", matrizB);
        exibirMatriz("RESULTADO A * B", resultado);
    }

    public static void preencherMatriz(int[][] matriz, int[] valores) {
        int c = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = valores[c++];
            }
        }
    }

    public static int[][] multiplicarMatrizes(int[][] matrizA, int[][] matrizB) {
        int[][] resultado = new int[matrizA.length][matrizB[0].length];
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizB[0].length; j++) {
                for (int k = 0; k < matrizA[0].length; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }
        return resultado;
    }

    public static void exibirMatriz(String nome, int[][] matriz) {
        System.out.println("\n" + nome + ":");
        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
    }

}
