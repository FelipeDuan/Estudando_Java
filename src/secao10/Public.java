package secao10;
// Aula sobre public
/*
    - Púlico, ou seja, pode ser utilizado em todo o projeto
 */

public class Public {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Luís Eduardo", "Rua Deide Costas, 169");

        System.out.println(cliente.hashCode());
    }
}
