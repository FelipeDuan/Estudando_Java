package aulaPOO.aula4.CadastroProdutos;

import java.util.Scanner;

// Cadastro de Produtos
public class exe01 {
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Informe o nome do seu produto: ");
        String nome = teclado.nextLine();

        System.out.print("Informe o preço do seu produto: ");
        double preco = Double.parseDouble(teclado.nextLine());

        Produto produto = new Produto(nome, preco);

        produto.informacoes();
        produto.aplicarDesconto();

        teclado.close();

    }
}
