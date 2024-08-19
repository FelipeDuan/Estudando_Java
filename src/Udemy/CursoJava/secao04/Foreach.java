package Udemy.CursoJava.secao04;

// Aula sobre a estrutura de repetição Udemy.CursoJava.secao04.Foreach (para cada)
public class Foreach {
    public static void main(String[] args) {
        String nome = "Felipe Duan";

        // Para cada um dos caracteres da string, imprima o caractere
        for (char letra : nome.toCharArray()) {
            System.out.println(letra);
        }
    }
}
