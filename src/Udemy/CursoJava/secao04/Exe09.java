package Udemy.CursoJava.secao04;

// Programa que declara um valor inteiro, inicialize-o com 0, incremente-o de 1000 em
// 1000, imprimindo seu valor na tela, até que seu valor seja 100000 (cem mil)
public class Exe09 {
    public static void main(String[] args) {
        int valor = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println(valor = valor + 1000);
        }

        /*
        // Solução Alternativa
        int valor;

        for (valor = 0; valor <= 10000;) {
            System.out.println(valor);
            valor = valor + 1000;
        }
         */
    }
}
