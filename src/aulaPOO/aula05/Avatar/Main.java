package aulaPOO.aula05.Avatar;

public class Main {
    public static void main(String[] args) {
        Dobrador Felipe = new Dobrador("Felipe Duan", "Nação do ar");
        Felipe.info();

        dAr Aang = new dAr("Aang", "Nação do ar");
        Aang.info();
        Aang.dobrarAr();

        dAgua Katara = new dAgua("Katara", "Nação do Fogo");
        Katara.info();
        Katara.dobrarAgua();

        dTerra Toph = new dTerra("Toph", "Nação da Terra");
        Toph.info();
        Toph.dobrarTerra();

        dFogo Zuko = new dFogo("Zuko", "Nação da Fogo");
        Zuko.info();
        Zuko.dobrarFogo();

    }
}
