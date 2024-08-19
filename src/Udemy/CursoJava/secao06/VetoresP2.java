package Udemy.CursoJava.secao06;

// Aula sobre Vetores - Parte 2
public class VetoresP2 {
    public static void main(String[] args) {
        // Declaração e definição de tamanho do vetor
        int[] numeros = new int[10];

        System.out.println("Tamanho do Vetor: " + numeros.length);

        for (int i = 0; i < numeros.length; i++) {
            // numeros[0] = i + 3;
            numeros[i] = i + 3;
            //numeros[9] = i + 3;
        }

        System.out.println(numeros[0]);// primeiro elemento
        System.out.println(numeros[9]);// último elemento

        // 0...9
        // numeros[10] = 42;
        // System.out.println(numeros[10]);
        // Os vetores/arrays possuem tamanho fixo e não podem ser aumentados/diminuídos

        numeros[0] = 7;
        System.out.println(numeros[0]);// primeiro elemento

        // numeros[0] = 23.4f; -> Errado, tipo diferente do definido
        // Os vetores/arrays possuem tipos de dados fixos, e não aceitam tipos variados

        for (int i = 0; i < numeros.length; i++) {
            // Math.round -> recebe valores double passa para int (arredonda os valores)
            // Math.random -> gera números aleatórios entre 0 e 1
            numeros[i] = (int)Math.round(Math.random() * 10);// cast
        }

        System.out.println(numeros[0]);// primeiro elemento
        System.out.println(numeros[9]);// último elemento
        // 0...1
        System.out.println(Math.random());

        System.out.println(Math.random() * 10);

        System.out.println(Math.round(Math.random() * 10));

        for (int i : numeros) {
            System.out.println(i);
        }
    }
}
