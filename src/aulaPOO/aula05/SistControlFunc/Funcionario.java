package aulaPOO.aula05.SistControlFunc;

public class Funcionario {
    // Atributos dos Funcionários
    public String nome;
    public String cargo;
    private double salario;

    // Construtor

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        if (salario > 0) {
            this.salario = salario;
        } else {
            this.salario = 1509; // salário mínimo
        }
    }



    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void info() {
        System.out.println("=========== Informações do Funcionário ===========");
        System.out.println("-> Nome: " + nome);
        System.out.println("-> Cargo: " + cargo);
        System.out.println("-> Salario: " + salario);
        System.out.println();
    }

    public void promover(String novoCargo, double aumento) {
        if (aumento > 0) {
            setCargo(novoCargo);

            setSalario(getSalario() + aumento);
        } else {
            System.out.println("Informações inválidas!");
        }
    }
}
