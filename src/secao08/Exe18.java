package secao08;

public class Exe18 {
    public static void main(String[] args) {
        // Instanciando o objeto Tv
        Televisao tv = new Televisao();

        // Liga/Desliga
        tv.liga_desliga();

        // Aumentando Canal
        tv.aumentar_canal();
        tv.aumentar_canal();

        // Mudando Canal
        tv.mudar_canal(40);

        // Diminuindo Canal
        tv.diminuir_canal();

        // Aumentando volume
        tv.aumentar_volume();
        tv.aumentar_volume();
        tv.aumentar_volume();

        // Diminuindo Volume
        tv.diminuir_volume();

        tv.liga_desliga();
    }
}
