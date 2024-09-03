package aulaPOO.aula4.EstudandoAcesso;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Felipe Duan", 2000);

        p1.informacoes();
        p1.subirDeCargo(); // Subindo de cargo + aumento do salário
        p1.informacoes();

        // Mudar cpf
        p1.mudarCpf(4000);

        p1.informacoes();
    }
}
