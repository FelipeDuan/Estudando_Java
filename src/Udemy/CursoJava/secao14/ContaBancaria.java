package Udemy.CursoJava.secao14;

@SuppressWarnings("ALL")
public class ContaBancaria {
    private int numero;
    private String cliente;

    // Atributo Estático do tipo 'int'
    public static int contador = 1;

    public ContaBancaria(String cliente){
        this.numero = contador;
        this.cliente = cliente;
        ContaBancaria.contador = ContaBancaria.contador + 1;
    }

    public int getNumero() {
        return numero;
    }

    public String getCliente() {
        return this.cliente;
    }

    public static int proximaConta() {
        return ContaBancaria.contador;
    }
}
