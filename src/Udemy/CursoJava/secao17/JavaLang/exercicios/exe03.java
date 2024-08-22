package Udemy.CursoJava.secao17.JavaLang.exercicios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exe03 {
    static String arq;
    static int contaVogais = 0;
    static int contaConsoantes = 0;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o nome de um arquivo texto: ");
        arq = teclado.nextLine();

        leitura();

        teclado.close();
    }

    static void leitura() {
        try {
            Scanner ler = new Scanner(new FileInputStream(arq));

            while (ler.hasNextLine()) {
                String linha = ler.nextLine();

                if (linha.charAt(0) == 'a' || linha.charAt(0) == 'A'
                || linha.charAt(0) == 'e' || linha.charAt(0) == 'E'
                || linha.charAt(0) == 'i' || linha.charAt(0) == 'I'
                || linha.charAt(0) == 'o' || linha.charAt(0) == 'O'
                || linha.charAt(0) == 'u' || linha.charAt(0) == 'U') {
                    contaVogais += 1;
                } else {
                    contaConsoantes += 1;
                }

            }

            System.out.println("O arquivo " + "'" + arq + "'" + " possui " + contaVogais + " vogais");
            System.out.println("O arquivo " + "'" + arq + "'" + " possui " + contaConsoantes + " consoantes");

            ler.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");
        }
    }
}
