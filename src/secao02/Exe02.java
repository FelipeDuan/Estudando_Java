package secao02;// Programa que pede 3 números ao usuário e faz a sua soma
import java.io.IOException; // importando classe para usar o System.in.read();
import java.util.Scanner; // importando classe Scanner

public class Exe02 {
    // Função secao02. Main
    @SuppressWarnings({"ResultOfMethodCallIgnored"})
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in); // instanciando e criando um objeto Scanner
        int num1, num2, num3, soma;

        System.out.print("Digite o 1º número inteiro: "); // imprimindo no console
        num1 = Integer.parseInt(teclado.nextLine()); // entrada de dados (lendo um valor inteiro)

        System.out.print("Digite o 2º número inteiro: ");
        num2 = Integer.parseInt(teclado.nextLine());

        System.out.print("Digite o 3º número inteiro: ");
        num3 = Integer.parseInt(teclado.nextLine());

        soma = num1 + num2 + num3;

        // Resultado
        System.out.printf("\nO Resultado da soma dos números é: %d + %d + %d = %d \n", num1, num2, num3, soma);
        System.out.print("Pressione enter para continuar...");
        System.in.read(); // semelhante ao system("pause") em C
        System.out.println("Finalizado!");
        teclado.close();
    }
}
