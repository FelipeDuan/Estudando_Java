package secao15;

import java.io.IOException;
import java.util.Scanner;

@SuppressWarnings("ALL")
public class Excecao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o n1: ");
        int n1 = teclado.nextInt();

        System.out.print("Informe o n2: ");
        int n2 = teclado.nextInt();

        try {
        System.out.println("O resultado é: " + divisao(n1, n2));
        } catch (ArithmeticException e) {
            System.out.println("Não foi possível executar a divisão");
        } catch (Exception e) {
            System.out.println("Ocorreu uma outra exceção");
        }

        teclado.close();
    }

    // Estou criando uma função que avisa que há a possibilidade de lançar
    // uma exceção do tipo Exception
    public static int divisao(int n1, int n2) throws IOException {
        return n1 / n2;
    }
}
