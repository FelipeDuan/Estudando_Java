package Udemy.CursoJava.secao04;

// Programa que escreva na tela, de 1 até 100, de 1 em 1, 3 vezes. A primeira vez,
//deve usar a estrutura de repetição for, a segunda while e a terceira do while.
public class Exe08 {
    public static void main(String[] args) {
        int i;

        // Udemy.CursoJava.secao04.For
        System.out.println("Com Udemy.CursoJava.secao04.For:");
        for (i = 1; i <= 100; i++) {
            System.out.println(i);
        }
        System.out.println("-----------------");


        int n = 1;
        System.out.println("Com Udemy.CursoJava.secao04.While:");
        while (n <= 100) {
            System.out.println(n);
            n = n + 1;
        }
        System.out.println("-----------------");



        int a = 1;
        System.out.println("Com Do while:");
        do {
            System.out.println(a);
            a = a + 1;
        } while (a <= 100);
    }
}
