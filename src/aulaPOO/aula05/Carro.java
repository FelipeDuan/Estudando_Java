package aulaPOO.aula05;

import java.util.Scanner;

public class Carro {
    public String nome;
    public String marca;

    public Carro(String nome, String marca) {
        this.nome = nome;
        this.marca = marca;
    }

    public void abastecer() {
        Scanner teclado = new Scanner(System.in);
        int escolha;

        System.out.println("Qual combustível prefere?");
        System.out.println("1 - Gasolina");
        System.out.println("2 - Aditivada");
        System.out.println("3 - Etanol");
        escolha = Integer.parseInt(teclado.nextLine());
        switch (escolha) {
            case 1:
                System.out.println("Reabastecendo com gasolina!");
            break;

            case 2:
                System.out.println("Reabastecendo com aditivada!");
            break;

            case 3:
                System.out.println("Reabastecendo com etanol!");
            break;

            default:
        }
    }
}
