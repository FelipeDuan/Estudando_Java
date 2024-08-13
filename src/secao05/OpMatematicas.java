package secao05;

// Aula sobre Operações Matemáticas
@SuppressWarnings("ALL")
public class OpMatematicas {
    public static void main(String[] args) {
        // Mesma coisa do C
        int num1 = 5, num2 = 9, x = 2, y = 4, z = 27,  res;
        float res2;

        // Soma
        res = num1 + num2;
        System.out.printf("A soma de %d + %d é %d\n", num1, num2, res);

        // Subtração
        res = num2 - num1;
        System.out.printf("A subtração de %d - %d é %d\n", num2, num1, res);

        // Multiplicação
        res = num1 * num2;
        System.out.printf("A multiplicação de %d * %d é %d\n", num1, num2, res);

        // Divisão (Inteira)
        res = num2/ num1;
        System.out.printf("A divisão de %d / %d é %d\n", num1, num2, res);

        // Divisão (Real)
        res2 = (float)num2 / (float)num1; // cast
        System.out.println("A divisão de " + num2 + " / " + num1 + " é " + res2);

        // Módulo
        res = num1 % 2; // Nesse caso, se o resto for 0, o número é par. Se o resto for 1, é impar
        System.out.println("O resto da divisão de " + num1 + " por 2 é " + res);

        res = num2 % 3; // Aqui, verificaremos se um número é divisível por outro
        System.out.println(num2 + " é divisível por 3? " + res); // Se for 0, sim. Se for 1, não

        /*
                    Tópico Especial
         Potenciação:
            X elevado a Y --> Math.pow(x, y)

         Radiciação:
            Raiz quadrada --> Math.sqrt()
            Raiz cúbica --> Math.cbrt()
            Raiz n-ésima de x --> Math.pow(x, 1.0/n)
        Ex: Logo abaixo
         */
        System.out.println("2 elevado a 4 é " + Math.pow(x,y));
        System.out.println("A raiz quadrada de 9 é " + Math.sqrt(num2));
        System.out.println("A raiz cúbica de 27 é " + Math.cbrt(z));

        // x = y^3; ⇒ Errado, "^" é usado para simbolizar a porta XOR e não para potenciação







    }
}
