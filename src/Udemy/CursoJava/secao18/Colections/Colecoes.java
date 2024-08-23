package Udemy.CursoJava.secao18.Colections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

// Aula sobre Coleções
/*
    Arrays (Vetores/Matrizes):
    - Tem tamanho fixo. Ou seja, se criarmos um array com 5 elementos,
    ele terá sempre no máximo 5 elementos
    - Um array tem tipo de dado fixo. Ou seja, se criarmos um array de inteiros,
    ele só terá inteiros.
    - É difícil encontrar um determinado elemento no array. Precisa-se, para isso,
    percorrer o array completo através de seu índice, caso não seja feito a busca
    pelo índice

    Coleções:
    - Um vetor / um matriz são como coleções de itens, coleção de dados
    - Java possui diversas classes / interfaces que facilitam muito o trabalho
    quando se trata de coleções de dados. Essas classes / interfaces são chamadas
    de Collections (Coleções)

    Listas:
    - Aceitam repetição de valores
    - Possuem tamanho 'indeterminado' (depende da memória)
    - Permite colocar valores de qualquer tipo, desde que não se especifique nenhum
    tipo na declaração
 */
public class Colecoes {
    public static void main(String[] args) {
//        ArrayList nomes = new ArrayList<>();
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Felipe"); // 0
        nomes.add("Luís"); // 1
        nomes.add("Duany"); // 2
        nomes.add("Roneide"); // 3
        nomes.add("Felipe"); // 4
        nomes.add("Dimmy"); // 5

//        nomes.add(44);
//        nomes.add(true);
//        nomes.add(12.4);
//        nomes.add('e');

//        System.out.println(nomes.get(0));
//        System.out.println(nomes.get(3));

//        System.out.println(nomes.size());
//
//        for (int i = 0; i < nomes.size(); i++) {
//            System.out.println(nomes.get(i));
//        }

        // Ordena automaticamente, nesse caso, em ordem alfabética
        Collections.sort(nomes);

        // Para objeto 'nome', dentro do array 'nomes', imprima cada objeto.
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
