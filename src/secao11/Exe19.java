package secao11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exe19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int lado;

        System.out.println("Olá, usuário! Vamos fazer alguns cálculos com quadrados!");
        System.out.print("Inicialmente, informe o valor do lado do quadrado: ");
        lado = Integer.parseInt(teclado.nextLine());

        Quadrado q1 = new Quadrado(lado);

        System.out.println("========= Quadrado =========");
        q1.imprimir();
    }
}
