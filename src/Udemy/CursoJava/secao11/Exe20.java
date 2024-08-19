package Udemy.CursoJava.secao11;

import java.util.Scanner;

public class Exe20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int marcha;
        Moto moto1 = new Moto("Yamaha", "Fz25", "Vermelha", 2);
        moto1.imprimir();

        System.out.print("Qual marcha deseja colocar agora? R: ");
        marcha = Integer.parseInt(teclado.nextLine());
        moto1.trocarMarcha(marcha);

    }
}
