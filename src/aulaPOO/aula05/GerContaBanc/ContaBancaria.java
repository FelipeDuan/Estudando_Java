package aulaPOO.aula05.GerContaBanc;

public class ContaBancaria {
    public String titular;
    public String numeroConta;
    private double saldo;
    private boolean ativa;

    public ContaBancaria(String titular, String numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0;
        this.ativa = true;
    }

    public String getTitular() {
        return titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void status() {
        if (isAtiva()) {
            System.out.println("Ativada!");
        } else {
            System.out.println("Desativada!");
        }
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public void ativarConta() {
        setAtiva(true);
    }

    public void desativarConta() {
        setAtiva(false);
    }

    public void sacar(double valor) {
        if (isAtiva()) {
            if (getSaldo() >= valor) {
                setSaldo(getSaldo() - valor);
            } else {
                System.out.println("Valor indisponível na conta");
            }
        } else {
            System.out.println("Não é possível sacar em contas desativadas!");
        }
    }

    public void depositar(double valor) {
        if (isAtiva()) {
            if (valor > 0) {
                setSaldo(getSaldo() + valor);
            } else {
                System.out.println("Valor de depósito inválido!");
            }
        } else {
            System.out.println("Não é possível realizar o depósito em contas inativas!");
        }
    }

    public void transferir(ContaBancaria contaDestino, double valor) {
        if(isAtiva() && contaDestino.isAtiva()) {
            if(valor > 0 && getSaldo() >= valor) {
                sacar(valor);
                contaDestino.depositar(valor);
            }
        } else {
            System.out.println("Status Conta 1: " + isAtiva());
            System.out.println("Status Conta 2: " + contaDestino.isAtiva());
        }
    }

    public void info() {
        System.out.println("=========== Informações do Funcionário ===========");
        System.out.println("-> Titular: " + getTitular());
        System.out.println("-> Conta: " + getNumeroConta());
        System.out.println("-> Saldo: " + getSaldo());
        System.out.println("-> Status: " + isAtiva());
        System.out.println();
    }


}
