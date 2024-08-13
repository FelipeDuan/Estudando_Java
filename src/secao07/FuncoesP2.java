package secao07;

// Ainda sobre Funções
@SuppressWarnings("ALL")
public class FuncoesP2 {
    public static void main(String[] args) {
        int valor1 = 6, valor2 = 4, res;
        System.out.println(mensagem());
        // Forma 1:
        //res = soma(valor1, valor2);
        //System.out.println("O resultado é: " + res);

        // Outra Forma:
        System.out.println("O resultado é: " + soma(valor1, valor2, "Olá"));

    }

    static int soma(int v1, int v2, String msg) {
        System.out.println(msg);
        return v1 + v2;
    }

    static String mensagem() {
        return "Olá Usuário";
    }
}
