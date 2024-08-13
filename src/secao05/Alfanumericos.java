package secao05;

// Aula sobre tipos de dados Alfanuméricos (Caracteres e Strings)
@SuppressWarnings("ALL")
public class Alfanumericos {
    public static void main(String[] args) {
        // Tipos Primitivos
        char letra = 'a'; // Aspas simples
        char letra2 = 97; // 97 em decimal == 'a'
        // char letra4 = "b"; -> Errado
        // string nom = "adads"; -> não existe o tipo primitivo "string" em Java, apenas o Não Primitivo

        System.out.println("Letra2 " + letra2);

        letra2 = (char) (letra2 + 1); // cast -> (tipo de dado a ser considerado) (operação);

        System.out.println("Letra1 " + letra);
        System.out.println("Letra2 " + letra2);

        //Tipos não Primitivos
        Character letra3 = 'A';
        String nome = "Felipe Duan";

        System.out.println("Letra3 " + letra3);
        System.out.println("char/Character: " + Character.SIZE + " bits -> 2 Bytes");

        System.out.println("char/Character: " + Character.MIN_VALUE + " bits");// 0
        System.out.println("char/Character: " + Character.MAX_VALUE + " bits"); // 65535

        System.out.println("Nome " + nome);
        System.out.println("Tamanho da String: " + nome.length());
        System.out.println("String " + (Character.SIZE * nome.length()) + " bits");

    }
}
