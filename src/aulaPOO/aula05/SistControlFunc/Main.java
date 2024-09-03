package aulaPOO.aula05.SistControlFunc;
// Sistema de Controle de Funcionários
public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Felipe Duan", "Analista", 3000);

        f1.info();
        f1.promover("Gerente", 5000);
        f1.info();
    }

}
