package Udemy.CursoJava.secao17.JavaLang.exercicios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class exe01 {
    static String linha;
    static Scanner teclado = new Scanner(System.in);
    static String msg;

    public static void main(String[] args) {
        // Criando um arquivo de nome "arq.txt"
        escrita();

        // Fazendo a Leitura do arquivo
        leitura();
    }

    static void escrita() {
        try {
            PrintStream escrever = new PrintStream(new FileOutputStream("arq.txt", true));

            do {
                System.out.println("Escreva algo ou 0 para sair: ");
                msg = teclado.nextLine();

                if (!msg.contains("0")){
                    escrever.println(msg);
                }

            } while (!msg.contains("0"));

            escrever.close();
        } catch (FileNotFoundException e) {
            System.out.println("O arquivo não foi encontrado");
        }
    }

    static void leitura() {
        try {
            System.out.println();
            Scanner ler = new Scanner(new FileInputStream("arq.txt"));

            while (ler.hasNextLine()) {
                linha = ler.nextLine();
                System.out.println(linha);
            }

            ler.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
        }
    }
}
