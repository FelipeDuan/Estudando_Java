package Udemy.CursoJava.secao19.ThreadsEmJava;

import Udemy.CursoJava.secao10.Conta;

public class Deposito implements Runnable {
    private Conta conta;

    public Deposito(Conta conta) {
        this.conta = conta;
    }

    @Override
    public void run() {
        this.conta.depositar(100.0f);
    }
}
