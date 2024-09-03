package aulaPOO.aula05.Avatar;

public class dFogo extends Dobrador{
    protected String subDobra = "Raio";

    public dFogo(String nome, String nacao) {
        super(nome, nacao);
    }


    public void dobrarFogo() {
        System.out.println(nome +" está dobrando o fogo!");
        System.out.println();
    }
}
