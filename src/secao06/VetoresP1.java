package secao06;

// Aula sobre Vetores - Parte 1
    /*
        Arrays (vetores uni-dimensionais)
    int numeros[5]; 0...(n-1) -> 5 - 1 = 4
    float valores[10]; 0...9

    vetor[indice];
    numeros[0] = 1; -> primeiro elemento (indice 0)
    numeros[1] = 3; -> segundo elemento (indice 1)
    numeros[2] = 5; -> terceiro elemento (indice 2)
    numeros[3] = 7; -> quarto elemento (indice 3)
    numeros[4] = 9; -> quinto elemento (indice 4)

     */
@SuppressWarnings("ALL")
public class VetoresP1 {
    public static void main(String[] args) {
        // Declarando um vetor
        int[] vetor;

        // Declarando e especificando o tamanho do vetor
        // tipo nomeVetor[] == new tipoVetor[quant];
        int[] numeros = new int[5];

        // Declarando, especificando e inicializando
        int[] outros_numeros = {1,3,5,7,9};

        float[] valores = new float[5];
        char[] caracteres = new char[20];
        String[] nomes = new String[4];

        String[] frutas = {"Manga", "Uva", "Banana"};
    }
}
