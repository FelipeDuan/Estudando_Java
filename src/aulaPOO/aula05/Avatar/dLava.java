package aulaPOO.aula05.Avatar;

public class dLava extends dTerra{
    public dLava(String nome, String nacao) {
        super(nome, nacao);
    }

    public void dobrarLava() {
        System.out.println(nome +" está dobrando a lava!");
        System.out.println();
    }
}
