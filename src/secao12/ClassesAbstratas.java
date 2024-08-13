package secao12;

import secao11.Aluno;

// Aula sobre Classes Abstratas
/*
    - Recurso que permite um bloqueio na criação de objetos
    - Nãp conseguimos instanciar objetos de uma classe abstrata
    - Geralmente, classes abstratas são classes genéricas / superclasses
    - Uma classe abstrata pode ter:
        - atributos
        - métodos
        - métodos abstratos

    * Métodos Abstratos:
    - Métodos que não possuem implementação, possuem apenas declaração
    - Assim, as classes que herdarem algum method abstrato, obrigatoriamente,
    precisam implementar esses métodos
 */
public class ClassesAbstratas {
    public static void main(String[] args) {
        Aluno felipe = new Aluno("Felipe Duan", 2005, "hugostoso@gmail.com", "123456");

        System.out.println(felipe);

        felipe.outra_mensagem("Sou o " + felipe.getNome());
    }
}
