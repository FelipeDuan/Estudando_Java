// Sistema de Cadastro e Impressão de Livros em Biblioteca
package aulaPOO;

import java.util.ArrayList;
import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Livro> livros = new ArrayList<>();
        String nome, autor, cor, idade;
        int qtd;

        // Cadastrando livros
        System.out.println("Olá, bem vindo ao sistema de Cadastro e Impressão da biblioteca!");
        System.out.println("Quantos Livros você deseja cadastrar?");
        qtd = Integer.parseInt(teclado.nextLine());
        System.out.println();

        for (int i = 0; i < qtd; i++) {
            System.out.printf("Informe o nome do livro %d: ", i+1);
            nome = teclado.nextLine();

            System.out.printf("Informe o nome do autor %d: ", i+1);
            autor = teclado.nextLine();

            System.out.printf("Informe a cor do livro %d: ", i+1);
            cor = teclado.nextLine();

            System.out.printf("Informe a faixa etária (idade recomendada) do livro %d: ", i+1);
            idade = teclado.nextLine();
            System.out.println();

            // Declarando e Instânciando Objeto
            livros.add(new Livro(nome, autor, cor, idade));
        }


        // Imprimindo dados dos Livros
        System.out.println("================ Livros =================");
        System.out.println("-> Quantidade cadastrada: " + livros.size());
        System.out.println();

        for (int i = 0; i < livros.size(); i++) {
            System.out.println("-> Nome do livro " + (i+1) + " : " + livros.get(i).getNome());
            System.out.println("-> Autor do livro " + (i+1) + " : " + livros.get(i).getAutor());
            System.out.println("-> Cor do livro " + (i+1) + " : " + livros.get(i).getCor());
            System.out.println("-> Idade recomendada do livro " + (i+1) + " : " + livros.get(i).getFaixa_idade());
            System.out.println();
        }

        teclado.close();
    }
}




// Assim: para cada livro do tipo Livro do array livros, fazer...
// for (Tipo livro : array)

/*
    package aulaPOO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner teclado = new Scanner(System.in);
        int sala;

        System.out.print("Diga qual a sua sala: ");
        sala = Integer.parseInt(teclado.nextLine());

        char letra;
        String texto = "Ada";
        float numero = 3.14f;
        double dinheiro = 16.50;
        boolean estudar = true;


            igual ==
            diferente !=
            maior >
            menor <
            maior igual >=
            menor igual <=


        if (sala == 9) {
        System.out.println("Sua sala é " + sala);
        } else {
                System.out.println("Não estamos na turma ADA!");
        }

        /*
            AND &&
            OR ||
            XOR ~


                for (int i = 0; i <= sala; i++) {
        if (i == 9) {
        System.out.printf("A sala é %d ", i);
            } else {
                    System.out.println("Estou na sala: " + i);
            }
                    }

soma(3, 2);

Vaca mimosa = new Vaca();
mimosa.nome = "mimosa";
mimosa.cor = "Amarela";
mimosa.peso = 127.65;
mimosa.idade = 15;

        }

static void Somar() {

}

static int soma(int x, int y) {
    return x + y;
}

class Vaca {
    public String nome;
    public String cor;
    public double peso;
    public boolean gestante;
    public int idade;

    void falar() {
        System.out.println("Muuuuu!");
    }

    void correr(int d) {
        System.out.println("A vaca correu" + d + " distância");
    }
}

}

        */
