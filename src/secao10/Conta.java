package secao10;

// A Orientação a Objeto permite criar os próprios tipos de dados
/*
        Getter e Setters
    Getter:
    - Método público que ser para consultar dados;
    - Convenções -> A nomenclatura desses métodos é "getNomeDoAtributo()"
 */
@SuppressWarnings("ALL")
public class Conta {
    private int numero;
    private float saldo;
    private float limite;
    private Cliente cliente;

    public Conta(int numero, float saldo, float limite, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.cliente = cliente;
    }

    public void sacar(float valor) {
        // tenho 100
        // quero sacar 50
        // 100 - 50 = 50
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            System.out.println("Saque realizado com sucesso!");
        } else if ((this.saldo + this.limite) >= valor){
            // Calculando valor excedente do saque
            // 100 - 200 = -100
            float val_ret = this.saldo - valor;
            if (val_ret < 0) {
                this.saldo = 0;
            }
            val_ret = this.limite + val_ret;
            this.limite = val_ret;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Não foi possível, saldo insuficiente!");
        }
    }

    public void depositar(float valor) {
        // tenho 100
        // quero depositar 50
        // 100 + 50 = 150
        this.saldo = this.saldo + valor;
    }

    // Método getter do atributo Saldo
    public  float getSaldo() {
        return this.saldo + this.limite;
    }

    // Método getter do atributo Saldo
    public  float getLimite() {
        return this.limite;
    }
}
