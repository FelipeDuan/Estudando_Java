package Udemy.CursoJava.secao15;

import java.util.Scanner;

// Continuação da aula Try/Catch
public class ContTryCatch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o primeiro número para divisão: ");
        int num1 = teclado.nextInt();

        System.out.print("Informe o segundo número para divisão: ");
        int num2 = teclado.nextInt();

        try {
        System.out.println("A divisão dos numeros é: " + num1 + " / " + num2 + " = " + (num1/num2));
        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir " + num1 + " por " + num2);
        } finally {
            System.out.println("Faça isso também...");
        }
    }
}
