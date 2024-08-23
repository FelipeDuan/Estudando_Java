package Udemy.CursoJava.secao18.Colections;

import java.util.*;

// Aula sobre Mapas
/*
    - Os Mapas são representados, em Java, pela interface Map e mapeia seus elementos
    utilizando o conceito de chave / valor

    - Mapas são conhecidos como se fossem / representassem 3 coleções:
        * Coleção de Chaves
        * Coleção de Valores
        * Coleção de Associações
 */
public class Mapas {
    public static void main(String[] args) {
        Map<Integer, String> pessoas = new HashMap<>();

        // Method para adicionar
        // (idade, nome)
        pessoas.put(18, "Felipe Duan");
        pessoas.put(13, "Luís Eduardo");
        pessoas.put(45, "Duany Dreyton");

        // Coleção de Chaves
        System.out.println("Chaves :" + pessoas.keySet());

        // Coleção de Valores
        System.out.println("Valores :" + pessoas.values());

        // Coleção de Associações
        System.out.println("Associação :" + pessoas.entrySet());

        System.out.println();

        // Iterar na Coleção de Chaves

        // Disponibilizado a partir do Java 8
        // pessoas.keySet() -> devolve uma lista com as chaves
        // forEach() -> para cada idade, imprimir a chave 'idade'
        // Forma 1:
        pessoas.keySet().forEach(idade -> System.out.println(pessoas.get(idade)));

        System.out.println();

        // Forma 2:
        Set<Integer> chaves = pessoas.keySet();
        for (Integer idade : chaves) {
            System.out.println(pessoas.get(idade));
        }

        System.out.println();

        // Iterar na coleção de Valores

        // Forma 1:
        Collection<String> valores = pessoas.values();
        for (String nome : valores) {
            System.out.println(nome);
        }

        System.out.println();

        // Forma 2:
        pessoas.values().forEach(System.out::println);

        System.out.println();

        // Iterar a coleção de Associações

        // Forma 1:
        Set<Map.Entry<Integer, String>> associacoes = pessoas.entrySet();
        for (Map.Entry<Integer, String> associacao : associacoes) {
            System.out.println(associacao.getKey() + " - " + associacao.getValue());
        }

        System.out.println();

        // Forma 2:
        pessoas.forEach((key, value) -> System.out.println(key + " - " + value));

    }
}
