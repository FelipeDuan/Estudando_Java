package Udemy.CursoJava.secao17.JavaLang;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

// Aula sobre Leitura e Escrita em arquivos
public class Escrita {
    public static void main(String[] args) {
        // Fazendo a Escrita em arquivos
        Scanner teclado = new Scanner(System.in);

        try {
            // Desta forma, toda vez que o programa for executado, o arquivo
            // será recriado e toda informação pré-existente, será excluida
            PrintStream escrever = new PrintStream("arquivo.txt");

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
