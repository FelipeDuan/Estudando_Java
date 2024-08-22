package Udemy.CursoJava.secao17.JavaLang.exercicios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exe02 {
    static String arq;
    static int contaLinhas = 0;
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
                contaLinhas += 1;
                ler.nextLine();
            }

            System.out.println("O arquivo " + "'" + arq + "'" + " possui " + contaLinhas + " linhas");

            ler.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");
        }
    }
}
