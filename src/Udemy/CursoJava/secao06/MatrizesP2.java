package Udemy.CursoJava.secao06;

// Aula sobre Matrizes - Parte 2
public class MatrizesP2 {
    public static void main(String[] args) {
        int[][] numeros = new int[3][3];
        numeros[0][0] = 1;
        numeros[0][1] = 3;
        numeros[0][2] = 5;
        numeros[1][0] = 7;
        numeros[1][1] = 9;
        numeros[1][2] = 11;
        numeros[2][0] = 13;
        numeros[2][1] = 15;
        numeros[2][2] = 17;

        for (int i = 0; i < numeros.length; i ++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = i + j * 2;
            }
        }

        // Imprimindo a matriz
        for (int i = 0; i < numeros.length; i ++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.printf("numeros[%d][%d] = %d\n", i, j, numeros[i][j]);
            }
        }
    }
}
