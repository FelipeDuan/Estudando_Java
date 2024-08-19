package Udemy.CursoJava.secao14;
// Aula sobre Atributos Estáticos
/*
    - São Atributos em que os valores são compartilhados entre as instâncias da classe
    Deve ser acessado de forma estática, coloca-se o nome da classe junto ao atributo:
    Ex: Classe.atributo
 */
public class AtributosEstaticos {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria("Felipe Duan");
        System.out.println(c1.getNumero());
        System.out.println(c1.getCliente());

        ContaBancaria c2 = new ContaBancaria("Luis Eduardo");
        System.out.println(c2.getNumero());
        System.out.println(c2.getCliente());

        ContaBancaria c3 = new ContaBancaria("Duany Dreyton");
        System.out.println(c3.getNumero());
        System.out.println(c3.getCliente());

        System.out.println(ContaBancaria.contador);

        ContaBancaria.contador = 42;
        System.out.println(ContaBancaria.contador);

        ContaBancaria c4 = new ContaBancaria("Roneide Brito");
        System.out.println(c4.getNumero());
    }
}
