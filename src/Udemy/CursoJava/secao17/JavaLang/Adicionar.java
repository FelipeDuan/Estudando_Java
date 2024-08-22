package Udemy.CursoJava.secao17.JavaLang;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

// Escrita em Arquivos 2 (Append)
public class Adicionar {
    public static void main(String[] args) {
        // Fazendo a Escrita em arquivos
        Scanner teclado = new Scanner(System.in);

        try { // Fazendo o Append / true -> Se existe, adiciona inf. / Se não, cria e adc.
            PrintStream escrever = new PrintStream(new FileOutputStream("arquivo.txt", true));

            for (int i = 0; i < 5; i++) {
                System.out.println("Escreva algo: ");
                String msg = teclado.nextLine();
                escrever.println(msg);
            }
            escrever.close();

        } catch (FileNotFoundException e) {
            System.out.println("Não foi possível criar o arquivo");
        }

        teclado.close();
    }
}
