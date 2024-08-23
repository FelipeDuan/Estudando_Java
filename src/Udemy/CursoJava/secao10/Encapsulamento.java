package Udemy.CursoJava.secao10;
// Aula sobre Encapsulamento
// Proteção adicionada aos atributos para proteger a segurança dos dados
public class Encapsulamento {
    public static void main(String[] args) {
        Cliente felipe = new Cliente("Felipe Duan", 18, "Rua Giuseppe Camole, 476");
        Cliente duany = new Cliente("Duany Dreyton", 45, "Rua Im Ghost to the down cool, 169");

        Conta conta_felipe = new Conta(1, 100.0f, 200.0f, felipe);
        Conta conta_duany = new Conta(2, 300.0f, 500.0f, duany);

        System.out.println("Saldo do Felipe: " + conta_felipe.getSaldo());
        System.out.println("Saldo do Duany: " + conta_duany.getSaldo());

        conta_felipe.sacar(270);
        System.out.println("Saldo do Felipe (Depois do Saque): " + conta_felipe.getSaldo());

    }
}
