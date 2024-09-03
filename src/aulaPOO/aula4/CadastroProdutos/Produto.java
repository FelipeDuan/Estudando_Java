package aulaPOO.aula4.CadastroProdutos;


import static aulaPOO.aula4.CadastroProdutos.exe01.teclado;

public class Produto {
    public String nome;
    private double preco;
    boolean rodando = true;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void informacoes() {
        System.out.println("========== Informações do produto ==========");
        System.out.println("-> Nome do produto: " + nome);
        System.out.println("-> Preco do produto: " + preco);
        System.out.println();
    }

    public void aplicarDesconto() {
        double porcentagem;
        double desconto;


        while (rodando) {
            System.out.println("Para aplicar desconto, escolha uma das opções abaixo:");
            System.out.println("+=============================+");
            System.out.println("|    1 - DESCONTO PADRÃO (10%)|");
            System.out.println("+=============================+");
            System.out.println("|    2 - ESCOLHER DESCONTO    |");
            System.out.println("+=============================+");
            System.out.println("|    3 - NÃO PASSAR DESCONTO  |");
            System.out.println("+=============================+");
            System.out.print("Sua resposta: ");
            int escolha = Integer.parseInt(teclado.nextLine());

            switch (escolha) {
                case 1:
                    porcentagem = 10;
                    desconto = preco - (preco / 10);
                    System.out.println("O valor final, com desconto, é: " + Math.round(desconto) + " reais");
                    rodando = false;
                break;

                case 2:
                    System.out.print("Escolha o percentual de desconto (Entre 10 e 90): ");
                    porcentagem = Double.parseDouble(teclado.nextLine());

                    if (porcentagem >= 10 && porcentagem <= 90) {
                        desconto = preco - (preco * porcentagem / 100);
                        System.out.println("O valor final, com desconto, é: " + Math.round(desconto) + " reais");
                        rodando = false;
                    }
                break;

                case 3:
                    System.out.println("Certo! Nenhum desconto será aplicado!");
                    rodando = false;
                break;

                default:
                    System.out.println("A opção escolhida é inválida!");
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
            }
        }
    }


}
