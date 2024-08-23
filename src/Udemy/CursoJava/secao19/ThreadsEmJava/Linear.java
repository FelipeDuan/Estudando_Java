package Udemy.CursoJava.secao19.ThreadsEmJava;
// Aula sobre Threads em Java
// Simulação da geração de relatório + barra de tarefa (sem utilização de threads)
public class Linear {
    public static void main(String[] args) {
        BarraDeProgresso barra = new BarraDeProgresso();
        barra.executa();

        GeraRelatorio relatorio = new GeraRelatorio();
        relatorio.executa();
    }
}
