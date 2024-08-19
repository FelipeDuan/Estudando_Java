package Udemy.CursoJava.secao11;

public class Moto {
    String marca;
    String modelo;
    String cor;
    int marcha;

    public Moto(String marca, String modelo, String cor, int marcha) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.marcha = marcha;
    }

    public void imprimir() {
        System.out.println("-> Marca: " + this.marca);
        System.out.println("-> Modelo: " + this.modelo);
        System.out.println("-> Cor: " + this.cor);
        System.out.println("-> Marcha: " + this.marcha);
        System.out.println();
    }

    public void trocarMarcha(int valor) {
        // AND - && | OR - ||
        if (valor >= 0 && valor <= 5) {
            this.marcha = valor;
            System.out.println("Agora a marcha está na posição: " + this.marcha);
        } else {
            System.out.println("Esta moto não apresenta esse número de marchas!");
            System.out.println("A marcha ainda está na posição: " + this.marcha);
        }
    }
}
