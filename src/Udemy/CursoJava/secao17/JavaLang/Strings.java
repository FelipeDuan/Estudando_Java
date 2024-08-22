package Udemy.CursoJava.secao17.JavaLang;
// Aula Sobre Strings
/*
    Em Java, Strings são imutáveis, não mudam
 */
public class Strings {
    public static void main(String[] args) {
        String curso = "Programação em Java";

        // Altera na String, se encontar, a primeira palavra pela segunda, após isso guarda na String
        curso = curso.replace("Java", "Python");
        System.out.println(curso);

        /*
         Outra Forma: Guardando numa nova String
         Altera na String, se encontar, a primeira palavra pela segunda, após isso guarda na 'nova' String
         String nova = curso.replace("Java", "Python");
         */

        curso = curso.toLowerCase(); // Converte tudo para minúsculo
        System.out.println(curso);

        curso = curso.toUpperCase(); // Converte tudo para maiúsculo
        System.out.println(curso);

        // String é um conjunto de caracteres 'char'
        System.out.println(curso.charAt(0));

        for (int i = 0; i < curso.length(); i++) {
            System.out.println(curso.charAt(i));
        }
    }
}
