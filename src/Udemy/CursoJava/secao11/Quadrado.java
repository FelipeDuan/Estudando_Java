package Udemy.CursoJava.secao11;

public class Quadrado {
    double lado, area, perimetro;

    public Quadrado(double lado) {
        this.lado = lado;
        this.calcularPerimetro();
        this.calcularArea();
    }

    public void calcularArea() {
        this.area = this.lado * this.lado;
    }

    public void calcularPerimetro() {
        this.perimetro = 4 * this.lado;
    }

    public void imprimir() {
        System.out.println("-> Lado: " + this.lado);
        System.out.println("-> Perímetro: " + this.perimetro);
        System.out.println("-> Área: " + this.area);
    }

    /*
    Outra possível solução:

        public String calcularArea() {
            return "-> Área: " + lado * lado;
        }

        public String calcularPerímetro() {
            return "-> Perímetro: " + 4 * lado;
        }

     */

}
