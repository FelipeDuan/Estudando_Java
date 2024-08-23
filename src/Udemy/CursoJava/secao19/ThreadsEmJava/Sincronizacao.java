package Udemy.CursoJava.secao19.ThreadsEmJava;

import Udemy.CursoJava.secao10.Cliente;
import Udemy.CursoJava.secao10.Conta;

/*
    // Thread Não Sincronizada (Instável)

    - Por padrão, as threads não são sincronizadas. Podem ocorrer problemas de uma thread
    acessar o valor de um objeto que ainda não foi atualizado ou ainda as threads executarem
    depois do valor já estar impresso
 */

public class Sincronizacao {
    public static void main(String[] args) {
        Cliente cli1 = new Cliente("Felipe Duan", 18, "Rua 1");
        Conta c1 = new Conta(1, 200, 300, cli1); // Saldo = 500;

        Deposito acao = new Deposito(c1);
        Thread t1 = new Thread(acao);
        Thread t2 = new Thread(acao);

        t1.start(); // 500 + 100 = 600
        t2.start(); // 600 + 100 = 700

        System.out.println(c1);
    }
}
