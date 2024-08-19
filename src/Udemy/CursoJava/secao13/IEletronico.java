package Udemy.CursoJava.secao13;
/*
    Existe uma convenção de colocar a letra "I" no nome do arquivo
    para sinalizar que é uma Interface

    Uma Interface só pode conter:
      - Constantes (variáveis com valores constantes)
      - Métodos Abstratos

    Interface para servir de contrato para servir de contrato para produtos eletrônicos
    Qualquer produto eletrônico que implementar esta interface deverá implementar os
    métodos abstratos!
 */
@SuppressWarnings("ALL")
public interface IEletronico {
    // Constante (convencionado colocar tudo maiúsculo)
    public String MARCA = "Nexus";

    // Métodos Abstratos
    public void ligar();

    public void desligar();

    // Não pode implementar um method concreto
    // Ex: public String mensagem() {
    //       return "Texto";
    // }
}
