package Udemy.CursoJava.secao04;

import java.util.Scanner;

// Aula sobre a estrutura de repetição Udemy.CursoJava.secao04.For
public class For {
    public static void main(String[] args) {
        int idade;
        String nome;
        Scanner teclado = new Scanner(System.in);

        // Variável de controle; condição de parada; forma de incremento/decremento (i++ -> i = i + 1)
        for (int i = 0; i < 5; i++) {
            //noinspection DuplicatedCode
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
