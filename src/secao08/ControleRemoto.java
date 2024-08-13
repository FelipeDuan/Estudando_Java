package secao08;

public class ControleRemoto {
    boolean liga_desliga(boolean ligada) {
        return !ligada; // retorna o oposto Ex. true -> false
    }

    int aumentar_volume (int volume) {
        return volume + 1;
    }

    int diminuir_volume (int volume) {
        return volume - 1;
    }

    int aumentar_canal (int canal) {
        return canal + 1;
    }

    int diminuir_canal (int canal) {
        return canal - 1;
    }

    int mudar_canal (int canal) {
        return canal;
    }
}
