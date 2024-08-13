package secao12;
// Aula sobre Template Method
/*
    - O padrão Template Method define o esqueleto de um algoritmo em um method,
    transferindo alguns de seus passos para as subclasses. O Template Method
    permite que as subclasses redefinam certos passos de um algoritmo sem alterar
    a estrutura do próprio algoritmo

    Algoritmos são "receitas" passo a passo para resolver algum problema

    receber numero;
    retornar numero * numero;

    método_principal()  {
        passo1();
        passo2();
        passo3();
    }
 */
public class TemplateMethod {
    public static void main(String[] args) {
        TreinamentoIniciotemp tit = new TreinamentoIniciotemp();

        tit.treinoDiario();

        TreinamentoFimtemp tft = new TreinamentoFimtemp();

        tft.treinoDiario();
    }
}
