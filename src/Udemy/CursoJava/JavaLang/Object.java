package Udemy.CursoJava.JavaLang;

import Udemy.CursoJava.secao10.Cliente;
import Udemy.CursoJava.secao10.Conta;

// Aula sobre Object: A mãe de todas as classes
/*
    A classe object faz parte do pacote java.lang
 */
public class Object {
    public static void main(String[] args) {
        Cliente felipe = new Cliente("Felipe Duan", "Rua 1, 234");
        Cliente duany = new Cliente("Duany Dreyton", "Rua 2, 567");
        Conta c1 = new Conta(1, 200, 300, felipe);
        Conta c2 = new Conta(1, 200, 300, duany);

        System.out.println(c1); // por padrão, a instância já executa o to.String()
        System.out.println(c2);

        Caixa prateleira = new Caixa();

        if (c1.equals(c2)) {
            System.out.println("São a mesma conta");
        } else {
            System.out.println("São contas diferentes!");
            // Por mais que sejam os mesmos valores, são contas diferentes
        }

//        prateleira.adcionar(c1); // 0 -> tem get.Saldo()
//        prateleira.adcionar(c2); // 1 -> tem get.Saldo()

        //Conta conta = prateleira.pegar(0);

//        System.out.println(((Conta)prateleira.pegar(0)).getSaldo());

//        prateleira.adcionar(felipe); // 2 -> não tem get.Saldo()

//        System.out.println(prateleira.pegar(2).getSaldo());

        if (c1 instanceof Conta) { // Verifica se c1 é do tipo Conta
            System.out.println("O objeto é do tipo Conta");
        } else {
            System.out.println("O objeto não é do tipo Conta");
        }
    }
}
