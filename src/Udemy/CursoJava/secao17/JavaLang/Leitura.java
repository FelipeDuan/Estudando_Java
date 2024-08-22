package Udemy.CursoJava.secao17.JavaLang;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Lendo Arquivos
public class Leitura {
    public static void main(String[] args) {
        try {
            Scanner ler = new Scanner(new FileInputStream("entrada"));

            while (ler.hasNextLine()) {
                String linha = ler.nextLine();
                System.out.println(linha);
            }

            ler.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
        }
    }
}
