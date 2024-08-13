package secao13;
// Aula sobre Interfaces
/*
    - São definidas como "contratos"
    Ex: Uma empresa criou um contrato 'com regras' para definir a criação de
    um produto/serviço

    Quem implementar este contrato é 'obrigado' a seguir as regras

    O Luís decidiu implementar um produto/serviço baseado neste contrato
    A Roneide também decidiu implementar um produto ou serviço baseado no mesmo contrato

    Contrato para a confecção de um bolo:
      - O bolo precisa ser chocolate
      - O bolo deve ter cobertura
      - O bolo deve ser recheado
 */
public class Interfaces {
    public static void main(String[] args) {
        Ventilador vent = new Ventilador();

        System.out.println("A marca do ventilador é: " + IEletronico.MARCA);

        vent.desligar(); // Não deve imprimir a mensagem, por natureza já nasce "Desligado"
        vent.ligar(); // Deve aparecer "Ligando..."
        vent.desligar(); // Deve aparecer "Desligando..."
    }
}
