package aulaPOO.aula06.exe2;

public class Main {
    public static void main(String[] args) {
        // Instânciando Objetos
        Funcionario funcionario = new Funcionario();
        Gerente gerente = new Gerente();

        // Atribuindo nomes
        funcionario.nome = "Luís";
        gerente.nome = "Felipe";

        // Infos
        funcionario.descricao();
        gerente.descricao();
    }
}
