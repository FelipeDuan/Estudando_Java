package Udemy.CursoJava.secao18.Colections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// Aula sobre Conjuntos
/*
    - Os conjuntos são implementados com a interface Set, e uma
    das classes que implementam essa interface é a HashSet

    - A maioria das coleções possui os mesmos métodos já conhecidos
    e utilizados com as listas, mas o comportamento desses objetos
    é um pouco diferente

    - O desempenho também é melhor em conjuntos do que em listas

    Características dos Conjuntos:
    - Não aceitam valores repetidos
    - A ordem de inserção não é respeitada ('Ordena' aleatoriamente)
    - Não aceita uma ordenação diferente através do comando 'sort'
    - Não possui índice
    Ex:
        nomes.add("Felipe"); // 0
        nomes.add("Luís"); // 1
        nomes.add("Roneide"); // 2
        nomes.add("Duany"); // 3
        nomes.add("Felipe"); // Não entra, pois Conjuntos não aceitam repetição de valores / itens

        // Ele já ordena os itens, porém é aleatória
        System.out.println(nomes.size());

        System.out.println(nomes.add("Dimmy")); // Retorna True se conseguir adc, caso contrário, false

        Collections.sort(nomes); -> não aceitam uma ordenação diferente

        for (String nome : nomes) {
            System.out.println(nome);
        }
 */
public class Conjuntos {
    public static void main(String[] args) {
        // Declarando Conjuntos utilizando a interface
        Set<String> nomes = new HashSet<>();
        Scanner teclado = new Scanner(System.in);
        boolean res;

        for (int i = 0; i < 5; i++) {
            System.out.print("Informe o " + (i+ 1) + "/5 nome: ");
            String nome = teclado.nextLine();
            res = nomes.add(nome);

            // Se 'res' for false, então...
            if (!res) {
                System.out.println("O nome não pode ser repetido!");
                i--;
            }
        }

        System.out.println();
        System.out.println("No conjunto 'nomes' temos " + nomes.size() + " elementos");
        System.out.println();

        for (String nome : nomes) {
            System.out.println(nome);
        }

        teclado.close();
    }
}
