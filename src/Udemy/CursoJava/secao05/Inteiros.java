package Udemy.CursoJava.secao05;

// Aula sobre Tipos de Dados Númericos (Inteiros)
@SuppressWarnings("ALL")
public class Inteiros {
    public static void main(String[] args) {
        // Tipos Primários/Primitivos
        long num0 = 3; // inteiro muito grande 9999999999999999999 - até 19 dígitos
        int num1 = 4; // inteiro 9999999999// - ocupa mais espaço e memória - Só vai até 10 dígitos
        short num2 = 5; // inteiro (curto/menor/baixo) 999999
        byte num3 = 6; // inteiro ainda menor que o "short"
        char num8 = 7;

        // Tipos Não Primários/Primitivos (Classes que representam os Primários)
        Long num7 = (long) 999999; // Cast
        Integer num4 = 98;
        Short num5 = 99;
        Byte num6 = 100;
        Character num9 = 35;

        System.out.println("* Tipos Primários:");
        System.out.println("long -> Num 0 = " + num0);
        System.out.println("int -> Num 1 = " + num1);
        System.out.println("short -> Num 2 = " + num2);
        System.out.println("byte -> Num 3 = " + num3);
        System.out.println("char -> Num 8 = " + num8);

        System.out.println("---------------------------");
        System.out.println("* Tipos Não Primários:");
        System.out.println("Long -> Num 7 = " + num7);
        System.out.println("Integer -> Num 4 = " + num4);
        System.out.println("Short -> Num 5 = " + num5);
        System.out.println("Byte -> Num 6 = " + num6);
        System.out.println("Character -> Num 9 = " + num9);

        System.out.println("---------------------------");
        System.out.println("* Tamanho:");
        System.out.println("long/Long: " + Long.SIZE + " bits -> 5 Bytes");
        System.out.println("int/Integer: " + Integer.SIZE + " bits -> 4 Bytes");
        System.out.println("short/Short: " + Short.SIZE + " bits -> 2 Bytes");
        System.out.println("byte/Byte: " + Byte.SIZE + " bits -> 1 Byte");
        System.out.println("char/Character: " + Character.SIZE + " bits -> 2 Bytes");

        System.out.println("---------------------------");
        System.out.println("Valor Mínimo:");
        System.out.println("long/Long: " + Long.MIN_VALUE + " bits");
        System.out.println("int/Integer: " + Integer.MIN_VALUE + " bits");
        System.out.println("short/Short: " + Short.MIN_VALUE + " bits");
        System.out.println("byte/Byte: " + Byte.MIN_VALUE + " bits");
        System.out.println("char/Character: " + Character.MIN_VALUE + " bits"); // 0

        System.out.println("---------------------------");
        System.out.println("Valor Máximo:");
        System.out.println("long/Long: " + Long.MAX_VALUE + " bits");
        System.out.println("int/Integer: " + Integer.MAX_VALUE + " bits");
        System.out.println("short/Short: " + Short.MAX_VALUE + " bits");
        System.out.println("byte/Byte: " + Byte.MAX_VALUE + " bits");
        System.out.println("char/Character: " + Character.MAX_VALUE + " bits"); // 65535
    }
}
