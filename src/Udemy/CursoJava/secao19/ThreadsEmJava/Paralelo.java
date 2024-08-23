package Udemy.CursoJava.secao19.ThreadsEmJava;
// Aula sobre Threads em Java
// Simulação da geração de relatório + barra de tarefa (com utilização de threads)
public class Paralelo {
    public static void main(String[] args) {
        BarraDeProgresso barra = new BarraDeProgresso();
        Thread t1 = new Thread(barra);
        t1.start();

        GeraRelatorio relatorio = new GeraRelatorio();
        Thread t2 = new Thread(relatorio);
        t2.start();
    }
}
