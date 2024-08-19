package Udemy.CursoJava.secao15;
// Tratando exceções com try/catch e Finally
/*
    - Utiliza-se o 'try' para tentar realizar algo, geralmente algo que pode acarretar
    algum problema

    - Já o 'catch' é utilizado para capturar o erro e, assim, oferecer ao usuário uma
    mensagem adequada sem que o sistema quebre

        Finally:
    - Complemento do Try/Catch
    - "Após o código, finalize com..."
    - O Finally é sempre executado
 */
public class TryCatch {
    public static void main(String[] args) {
        int[] numeros = new int[5];// 0...4 -> 0,1,2,3,4 -> 0...n-1

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 3 * 2;
        }

        for (int i = 0; i <= numeros.length; i++) {
            try { // tente fazer isso
            System.out.println(numeros[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Você está tentando acessar uma posição do array que não existe!");
            } finally {
                System.out.println("Continua o processo...");
            }
        }
    }
}
