package Udemy.CursoJava.secao03;// Programa que peça ao usuário para digitar dois números e mostre qual deles é o maior

import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2;

        System.out.print("Digite o primeiro número: ");
        num1 = Integer.parseInt(teclado.nextLine());

        System.out.print("Digite o segundo número: ");
        num2 = Integer.parseInt(teclado.nextLine());

        if (num1 > num2) {
            System.out.printf("O número %d é maior que o número %d", num1, num2);
        } else if (num1 == num2) {
            System.out.print("Os números são iguais");
        } else {
            System.out.printf("O número %d é menor que o número %d", num1, num2);
        }

        teclado.close();
    }
}
