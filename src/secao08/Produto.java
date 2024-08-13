package secao08;// Classes
    /*
        - Nome das classes sempre começa com letras maiúsculas -> secao08.Produto
        - Não pode começar com números - Ex: 3Produtos
        - Não pode ter espaço - Ex: Guarda Chuva
        - Não conter caracteres especiais - Ex: Açucar

        Detalhe: Uma Classe Java não possui método secao02.Main, diferentemente dos Programas Java
        pois eles apresentam o método secao02.Main.
        - Não se criam programas a partir da Classe, apenas se definem as classes
        - O nome da classe Java DEVE ter mesmo nome do arquivo Java
        - Tudo que estiver dentro das chaves "{}" pertencem à classe
        - As classes Java apresentam a seguinte forma:

        public classe NomeDaClasse {

        }

     */

// Atributos
    /*
        - São as características da classe/molde/modelo de dados
        - Pode-se entender Atributos como "variáveis" da classe
        - Outra forma de nomenclatura para os Atributos são "Estados" da classe
        - São iniciados com letras minúsculas, não apresentam espaço e nem caracteres especiais/acentuação

     */

// Métodos
    /*
        - É possível entender os métodos como a ação que é realizada por um objeto da classe
        - Também pode-se compreender que os Métodos são comportamentos dos objetos da classe
        - Mesmos requisitos das Funções:
          * Tipo de retorno (Tipo de dado que vai retornar)
          * Nome (corresponde a ação que realiza)
          * Parâmetros/Argumentos (Opcional)
          * Retorno (Opcional - dependo do tipo de retorno)
     */

@SuppressWarnings("ALL")
public class Produto {
    String nome;
    float preco;
    float desconto;

    // Método para aumentar o preço do produto em 10 (vulgo inflação)
    void aumentar_preco(float valor) {
        this.preco = this.preco + valor;
    }
}
