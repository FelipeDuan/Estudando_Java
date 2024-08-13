package secao04;

import java.util.Scanner;

// Aula sobre as estruturas de repetição Do while
// Recebendo dados enquanto a idade for maior que 0
@SuppressWarnings("ALL")
public class DoWhile {
    public static void main(String[] args) {
        // Variáveis
        int idade;
        String nome;

        // Objeto Scanner para receber dados via teclado
        Scanner teclado = new Scanner(System.in);

        // Primeiro executa o bloco, depois verifica
        do {
            System.out.print("Informe seu nome: ");
            nome = teclado.nextLine();

            System.out.print("Informe sua idade: ");
            // Bug: idade = teclado.nextInt(); / resolução abaixo
            idade = Integer.parseInt(teclado.nextLine());

            if (idade > 0){
                System.out.println(nome + " tem " + idade + " anos");
            }
        } while (idade > 0);

        teclado.close();

    }
}
