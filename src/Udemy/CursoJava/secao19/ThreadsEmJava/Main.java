package Udemy.CursoJava.secao19.ThreadsEmJava;

import Udemy.CursoJava.secao10.Cliente;
import Udemy.CursoJava.secao10.Conta;

// Thread Sincronizada
/*
    O sincronismo ocorre, pois, durante a execução do method, a thread executa um 'lock' (bloqueio)
    da função para que outra thread só possa executá-la após a finalização da thread inicial
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Cliente cli1 = new Cliente("Felipe Duan", 18, "Rua 1");
        Conta c1 = new Conta(1, 200, 300, cli1); // Saldo = 500;

        Deposito acao = new Deposito(c1);
        Thread t1 = new Thread(acao);
        Thread t2 = new Thread(acao);

        t1.start(); // 500 + 100 = 600
        t2.start(); // 600 + 100 = 700

        // avisa que as threads devem se juntar a um sincronizador
        t1.join();
        t2.join();

        System.out.println(c1);
    }
}
