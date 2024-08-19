package Udemy.CursoJava.secao12;
// Template Method
/*
        Final
    - É um modificador de acesso que faz com que o elemento que esteja utilizando
    não possa ser extendido ou reescrito
 */
public abstract class Treinamento {

    // Template Method
    // não se pode reescrever esse method abaixo
    public final void treinoDiario() {
        preparoFisico();
        jogoTreino();
        treinoTatico();
    }

    public abstract void preparoFisico();

    public abstract void jogoTreino();

    public final void treinoTatico() {
        System.out.println("Treino tático...");
    }
}
