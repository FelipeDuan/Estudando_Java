// Sistema de Cadastro e Impressão de Livros em Biblioteca
package aulaPOO.Livraria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static List<Livro> livros = new ArrayList<>();
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        // Menu Principal
        Menu.menu();

        // Cadastrando Livros
        Livro.cadastar();

        // Imprimindo Livros
        Livro.detalhesLivros();

        teclado.close();
    }
}

// Assim: para cada livro do tipo Livro do array livros, fazer...
// for (Tipo livro : array)
