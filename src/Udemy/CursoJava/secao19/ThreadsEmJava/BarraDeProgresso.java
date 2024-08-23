package Udemy.CursoJava.secao19.ThreadsEmJava;
/*
    - Para executar métodos em paralelo, a classe deve implementar a interface Runnable
    e o method que precisar ser executado em paralelo deve ser executado dentro do method run
 */
public class BarraDeProgresso implements Runnable{
    public void executa() {
        // For 0 até 10 milhões
        for (int i = 0; i < 10000; i++) {
            System.out.println(i + " - Barra de progresso... aguarde!");
        }
    }

    // Funcionalidade para executar em paralelo
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(i + " - Barra de progresso... aguarde!");
        }
    }
}
