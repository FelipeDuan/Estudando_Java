package secao05;

// Aula sobre tipos de Dados secao05.Booleanos
@SuppressWarnings("ALL")
public class Booleanos {
    public static void main(String[] args) {
        // Tipos Primitivos
        boolean verdadeiro = true; // 1
        boolean falso = false;// 0

        // Tipos Não Primitivos
        Boolean v = true;
        Boolean f = false;

        boolean ativo = true;

        System.out.println("Verdadeiro " + verdadeiro);
        System.out.println("Falso " + falso);
        System.out.println("V " + v);
        System.out.println("F " + f);

        if (verdadeiro) {
            System.out.println("É Verdadeiro");
        } else {
            System.out.println("É Falso");
        }

        if (1 == 3) {
            System.out.println("1 == 1 é Verdadeiro");
        } else {
            System.out.println("... é falso");
        }

        if (ativo) {
            System.out.println("Pode acessar o sistema.");
        } else {
            System.out.println("Acesso Negado");
        }
    }
}
/*
    if (realiza uma verificação que no final retorna ou true ou false)
 */