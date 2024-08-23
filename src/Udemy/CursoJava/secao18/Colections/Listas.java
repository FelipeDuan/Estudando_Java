package Udemy.CursoJava.secao18.Colections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Pt. 2 ainda sobre listas
public class Listas {
    public static void main(String[] args) {
        // Melhor forma de fazer. Primeiro a Interface, depois a Classe
        List<Integer> numeros = new ArrayList<>();

        numeros.add(42);
        numeros.add(24);
        numeros.add(12);
        numeros.add(9);
        numeros.add(21);

        // Ordenando
        Collections.sort(numeros);

        // Para cada elemento Integer do array 'numeros', imprimir o elemento
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}
