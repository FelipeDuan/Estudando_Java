package secao03;

// Aula sobre a instrução switch
public class Switch {
    @SuppressWarnings("DataFlowIssue")
    public static void main(String[] args) {
        int numero = 1;

        switch (numero) {
            case 1:
                System.out.println("O número é 1");
                break;

            case 3:
                System.out.println(" o número é 3");
                break;

            case 5:
                System.out.println("O número é 5");
                break;

            default:
                System.out.println("numero = " + numero);
        }
    }
}
