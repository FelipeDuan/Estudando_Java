package Udemy.CursoJava.secao18.Colections;

import Udemy.CursoJava.secao10.Cliente;

import java.util.ArrayList;
import java.util.Collections;

// Ainda sobre Listas
public class Listas2 {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();

        Cliente cl1 = new Cliente("Felipe Duan",18, "Rua 10");
        Cliente cl2 = new Cliente("Duany Dreyton",45, "Rua 11");
        Cliente cl3 = new Cliente("Luís Eduardo", 13, "Rua 12");

        // Só pode adicionar elementos do tipo Cliente
        clientes.add(cl1);
        clientes.add(cl2);
        clientes.add(cl3);

        // Inicialmente, não consegue ordenar por 'nome' ou por 'rua'. Agora está ordenando pela idade
        Collections.sort(clientes);

        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
}
