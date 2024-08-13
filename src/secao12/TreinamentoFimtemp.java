package secao12;

public class TreinamentoFimtemp extends Treinamento{
    @Override
    public void preparoFisico() {
        System.out.println("Preparo físico de fim de temporada...");
    }

    @Override
    public void jogoTreino() {
        System.out.println("Jogo treino de fim de temporada...");
    }
}
