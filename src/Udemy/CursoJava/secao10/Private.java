package Udemy.CursoJava.secao10;
// Aula sobre Private
/*
    - Privado à própria classe

    Ou seja, só temos acesso ao atributo ou método privado
    dentro da própria classe onde ele foi declarado
 */
public class Private {
    public static void main(String[] args) {
        Cliente cli1 = new Cliente("Roneide Brito", "Bairro Marquês, 476");
        System.out.println("Nome: " + cli1.getNome());
        System.out.println("Endereço: " + cli1.getEndereco());
        System.out.println();

        Cliente cli2 = new Cliente("Duany Dreyton", "Rua Im Ghost to the down cool, 169");
        System.out.println("Nome: " + cli2.getNome());
        System.out.println("Endereço: " + cli2.getEndereco());
        System.out.println();

    }
}
