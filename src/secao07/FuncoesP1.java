package secao07;

import java.util.Scanner;

// Aula sobre Funções
// Criando minhas próprias funções
/*
    Faça um programa que receba diversos nomes de frutas do usuário e no final imprima
    essas frutas em ordem contrária. O programa deve solicitar ao usuário quantas
    frutas ele quer informar

    Informe quantas frutas deseja cadastrar: 2

    Informe o nome de uma fruta: Manga

    Informe o nome de uma fruta: Goiaba

    Goiaba, Manga;

 */

public class FuncoesP1 {
    // Variáveis Globais:
        // Declaração do vetor
        static String[] frutas;

        static Scanner teclado = new Scanner(System.in);


    public static void main(String[] args) {
        // Variável Local:
        int qtd;

        System.out.print("Informe a quantidade de frutas para cadastrar: ");
        qtd = Integer.parseInt(teclado.nextLine());

        // Deve-se colocar um parâmetro/argumento, assim como foi pré setado na função
        cadastroFrutas(qtd);

        imprimirFrutas(qtd);

        teclado.close();
    }

    /*
        Uma função deve ter o seguinte:
        - Tipo de retorno (Tipo de dado que a função vai retornar)
        - Nome (corresponde a ação que a função realiza)
        - Parâmetros/Argumentos (Opcional)
        - Retorno (Opcional - dependo do tipo de retorno)
     */

    // void = vazio (Função que não tem retorno)
    static void cadastroFrutas(int quantidade) {
        // Definindo o tamanho do vetor
        frutas = new String[quantidade];

        // Recebendo o nome das frutas
        for (int i = 0; i < quantidade; i++) { // i++ -> i = i + 1
            System.out.print("Informe o nome da fruta " + (i+1) + " : ");
            frutas[i] = teclado.nextLine();
        }

    }

    static void imprimirFrutas(int quantidade) {
        // Imprimindo as Frutas ao contrário
        for (int i = (quantidade - 1); i >= 0; i--) { // i-- -> i = i - 1
            System.out.println(frutas[i]);
        }
    }
}
