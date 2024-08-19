package Udemy.CursoJava.secao07;

import java.util.Scanner;

// Programa que receba a data atual (dia, mês e ano) e exiba na tela no formato textual.
// Exemplo: Data 01/01/2024, Imprimir: 1 de janeiro de 2024
public class Exe14 {
    // Globais:
    static Scanner teclado = new Scanner(System.in);
    static String d;

    public static void main(String[] args) {
        System.out.println("Insira a data atual");
        System.out.print("Ex. (01/01/2024): ");
        d = teclado.nextLine();

        data_texto(d);

        teclado.close();

    }

    static void data_texto(String data) {
        String[] partes = data.split("/");
        String mes_txt = "";

        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int ano = Integer.parseInt(partes[2]);

        switch (mes) {
            case 1:
                mes_txt = "janeiro";
            break;

            case 2:
                mes_txt = "fevereiro";
            break;

            case 3:
                mes_txt = "março";
            break;

            case 4:
                mes_txt = "abril";
            break;

            case 5:
                mes_txt = "maio";
            break;

            case 6:
                mes_txt = "junho";
            break;

            case 7:
                mes_txt = "julho";
            break;

            case 8:
                mes_txt = "agosto";
            break;

            case 9:
                mes_txt = "setembro";
            break;

            case 10:
                mes_txt = "outubro";
            break;

            case 11:
                mes_txt = "dezembro";
            break;

            case 12:
                mes_txt = "";
            break;

            default:
                System.out.println("Você inseriu uma opção inválida!");
        }

        System.out.println( dia + " de " + mes_txt + " de " + ano);
    }

}
