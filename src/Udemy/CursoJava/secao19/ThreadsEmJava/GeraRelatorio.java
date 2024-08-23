package Udemy.CursoJava.secao19.ThreadsEmJava;

public class GeraRelatorio implements Runnable {
    public void executa() {
        // For de 0 até 10 milhões
        for (int i = 0; i < 10000; i++) {
            System.out.println(i + " - Gerando relatório... aguarde!");
        }
    }


    @Override
    public void run() {
        // For de 0 até 10 milhões
        for (int i = 0; i < 10000; i++) {
            System.out.println(i + " - Gerando relatório... aguarde!");
        }
    }
}
