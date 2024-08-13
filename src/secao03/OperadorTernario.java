package secao03;

// Aula sobre Operador Ternário
public class OperadorTernario {
    @SuppressWarnings("ConstantValue")
    public static void main(String[] args) {
        int valor = -3, numero;

        /*
        if (valor > 0) {
            numero = valor;
        } else {
            numero = 7;
        }
         */

        // Operador Ternário
        // Aqui, a (condição) é verificada com "?"
        // Se for verdadeiro, a variável recebe o valor ou parâmetro seguinte
        // Caso contrário, é utilizado ":" como "else", recebendo após isso algum valor posterior
        numero = (valor > 0) ? valor : 7;

        // Para imprimir "println" mais rápido, digite "sout" e enter
        System.out.println(numero);
    }
}
