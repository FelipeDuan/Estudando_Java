package secao13;

public class Ventilador implements IEletronico {
    private boolean ligado = false;

    @Override
    public void ligar() {
        // Se for False, passará para True
        if (!this.ligado) {
            this.ligado = true;
            System.out.println("Ligando o aparelho...");
        }
    }

    @Override
    public void desligar() {
        // Se for True, passará para False
        if (this.ligado) {
            this.ligado = false;
            System.out.println("Desligando o aparelho...");
        }
    }
}
