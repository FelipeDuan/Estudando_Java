package Udemy.CursoJava.secao18.Colections;

import Udemy.CursoJava.secao10.Cliente;
import Udemy.CursoJava.secao10.Conta;

import java.util.HashMap;
import java.util.Map;

// Aula sobre HashMap
/*
    - A Classe HashMap implementa a interface Map e trabalha com chave / valor
    - Não aceita chaves duplicadas, mas valores sim!
 */
public class HM {
    public static void main(String[] args) {
        // Interface Map<Key, Value>
        Map<String, Conta> contas = new HashMap<>();

        Cliente cl1 = new Cliente("Felipe Duan", 18, "Rua 1");
        Cliente cl2 = new Cliente("Duany Dreyton", 45, "Rua 2");

        Conta c1 = new Conta(1, 200, 300, cl1);
        Conta c2 = new Conta(2, 400, 700, cl2);

        // (Chave, valor)
        contas.put("Pessoa Física", c1);
        contas.put("Pessoa Jurídica", c2);
//        contas.put("Pessoa Física", c1); -> não aceita chaves duplicados

//        System.out.println(contas.size());

        // Ao invés de passar o índice, se utiliza a chave
        System.out.println(contas.get("Pessoa Física")); // imprime o toString()
    }
}
