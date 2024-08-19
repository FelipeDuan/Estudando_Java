package Udemy.CursoJava.secao07;

import java.util.Scanner;

// Programa que recebe dois valores inteiros e retorna o maior
public class Exe15 {
    static Scanner teclado = new Scanner(System.in);
    static int num1, num2;

    public static void main(String[] args) {
        System.out.print("Insira o valor do numero 1: ");
        num1 = Integer.parseInt(teclado.nextLine());

        System.out.print("Insira o valor do numero 2: ");
        num2 = Integer.parseInt(teclado.nextLine());

        comparar(num1,num2);

        teclado.close();

    }

    static void comparar(int n1, int n2){
        if (n1 > n2) {
            System.out.println("O maior número é " + n1);
        } else if (n1 == n2) {
            System.out.println("Os números são iguais");
        } else {
            System.out.println("O maior número é " + n2);
        }
    }
}
