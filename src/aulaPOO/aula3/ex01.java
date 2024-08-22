package aulaPOO.aula3;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o seu nome: ");
        String nome = teclado.nextLine();

        System.out.print("Informe a sua idade: ");
        int idade = Integer.parseInt(teclado.nextLine());

        System.out.print("Informe a sua cidade: ");
        String cidade = teclado.nextLine();


        Pessoa p1 = new Pessoa(nome, idade, cidade);

        p1.imprimir();
        p1.fazerAniversario();
        p1.imprimir();

    }
}
