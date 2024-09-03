package aulaPOO.aula4.ReservaHotel;

public class Reserva {
    public String cliente;
    private int numQuarto;
    private boolean status = true;

    public Reserva(String cliente, int numQuarto) {
        this.cliente = cliente;
        this.numQuarto = numQuarto;
        this.status = false;
    }

    public void detalhesReserva() {
        System.out.println("============= Detalhes da Reserva =============");
        System.out.println("-> Cliente: " + cliente);
        System.out.println("-> Número do Quarto: " + numQuarto);

        if (status) {
            System.out.println("-> Status: Quarto disponível!");
        } else {
            System.out.println("-> Status: Quarto Ocupado!");
        }
    }

    public void cancelarReserva() {
        this.status = false;
    }


}
