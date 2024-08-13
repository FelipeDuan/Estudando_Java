package secao14;
// Aula sobre Métodos Estáticos
/*
    - Não depende de uma instância da classe para ser utilizado
    Pode ser utilizado conforme:
    Classe.method();
 */
public class MetodosEstaticos {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria("Felipe Duan");
        System.out.println("-> Número: " + c1.getNumero());
        System.out.println("-> Cliente: " + c1.getCliente());

        System.out.println("A próxima conta será: " + ContaBancaria.proximaConta());
    }
}
