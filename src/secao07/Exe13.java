package secao07;

import java.util.Scanner;

// Programa que possua uma função que recebe como parâmetro um número inteiro e
//devolve seu dobro
public class Exe13 {
    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Vamos calcular o dobro de um número!");
        System.out.print("Digite um número: ");
        numero = Integer.parseInt(teclado.nextLine());

        dobro(numero);

        teclado.close();
    }

    static void dobro(int num) {
        num = num * 2;
        System.out.println("O resultado é: " + num);
    }
}
