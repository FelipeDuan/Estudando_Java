package Udemy.CursoJava.secao05;

// Aula sobre Tipos de Dados Númericos (Udemy.CursoJava.secao05.Reais)
@SuppressWarnings("ALL")
public class Reais {
    public static void main(String[] args) {
        // Tipos Primários/Primitivos - ocupa menos memória / mais rápido para dados
        // Por padrão, os números reais em java são Double
        float preco1 = 23.4f; // tipo float exige o "f" no final / 23.40
        double preco2 = 24.00f; // 24.93563466746736252773

        //Tipos Não Primários/Primitivos - realizar conversões de um tipo para outro
        Float preco3 = 44.5f;
        Double preco4 = 45.00;

        System.out.println("* Tipos Primários:");
        System.out.println("float ->  Preço 1 = " + preco1);
        System.out.println("double -> Preço 2 = " + preco2);

        System.out.println("---------------------------");
        System.out.println("* Tipos Não Primários:");
        System.out.println("Float -> Preço 3 = " + preco3);
        System.out.println("Double -> Preço 4 = " + preco4);

        System.out.println("---------------------------");
        System.out.println("* Tamanho:");
        System.out.println("float/Float: " + Float.SIZE + " bits -> 4 Bytes");
        System.out.println("double/Double: " + Double.SIZE + " bits -> 5 Bytes");

        System.out.println("---------------------------");
        System.out.println("Valor Mínimo:");
        System.out.println("float/Float: " + Float.MIN_VALUE + " bits");
        System.out.println("double/Double: " + Double.MIN_VALUE + " bits");

        System.out.println("---------------------------");
        System.out.println("Valor Máximo:");
        System.out.println("float/Float: " + Float.MAX_VALUE + " bits");
        System.out.println("double/Double: " + Double.MAX_VALUE + " bits");


    }
}
