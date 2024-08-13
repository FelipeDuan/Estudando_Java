package secao04;

import java.util.Scanner;

// Aula sobre as estruturas de repetição secao04.While
// Recebendo dados enquanto a idade for maior que 0
@SuppressWarnings("ALL")
public class While {
    public static void main(String[] args) {
        // Variáveis
        int idade = 1;
        String nome;

        // Objeto Scanner para receber dados via teclado
        Scanner teclado = new Scanner(System.in);

        // Sempre verifica o valor antes de executar o bloco
        while (idade > 0) {
            System.out.print("Informe seu nome: ");
            nome = teclado.nextLine();

            System.out.print("Informe sua idade: ");
            // Bug: idade = teclado.nextInt(); / resolução abaixo
            idade = Integer.parseInt(teclado.nextLine());

            if (idade > 0){
                System.out.println(nome + " tem " + idade + " anos");
            }
        }

        teclado.close();

    }
}
