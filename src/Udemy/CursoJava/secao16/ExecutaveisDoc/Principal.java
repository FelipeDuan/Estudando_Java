package Udemy.CursoJava.secao16.ExecutaveisDoc;

import Udemy.CursoJava.secao10.Cliente;
import Udemy.CursoJava.secao10.Conta;

import java.util.Scanner;

/*
        Gerando executáveis Jar
    JAR → Java Archive
    Archive → Arquivo Compactado
    semelhante a zip/rar

 */
public class Principal {
    static Cliente cliente = new Cliente("Felipe Duan", "Rua Mário");
    static Conta conta = new Conta(1, 200, 300, cliente);
    static Scanner teclado = new Scanner(System.in);

    public static void depositar() {
        System.out.println("============== Depósito ==============");
        consultar();
        System.out.print("Informe o valor para depósito: ");
        float valor = Float.parseFloat(teclado.nextLine());
        if (valor > 0) {
            conta.depositar(valor);
            System.out.println("Depósito efetuado com sucesso!");
        } else {
            System.out.println("O valor do depósito precisa ser maior do que 0.");
        }
    }

    public static void sacar() {
        System.out.println("============== Saque ==============");
        consultar();
        System.out.print("Informe o valor para saque: ");
        float valor = Float.parseFloat(teclado.nextLine());
        if (valor > 0) {
            conta.sacar(valor);
        } else {
            System.out.println("O valor precisa ser maior que 0");
        }
    }

    public static void consultar() {
        System.out.println("Seu saldo é: " + conta.getSaldo());
    }

    @SuppressWarnings("UnusedAssignment")
    public static void main(String[] args) {
        int opcao = 0;
        System.out.println("Olá, bem-vindo ao Banco Nexus!");
        do {
            System.out.println("Digite o número da opção escolhida abaixo: ");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar");
            System.out.println("0 - Sair");
            System.out.print("R: ");
            opcao = Integer.parseInt(teclado.nextLine());

            switch (opcao) {
                case 1:
                    depositar();
                break;

                case 2:
                    sacar();
                break;

                case 3:
                    consultar();
                break;

                case 0:
                break;

                default:
                    System.out.println("Opção Inválida");
            }
            System.out.println();
        } while (opcao > 0);
    }
}
