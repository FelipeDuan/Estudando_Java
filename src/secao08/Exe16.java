package secao08;

public class Exe16 {
    public static void main(String[] args) {
        // Contatos
        Contato contato1 = new Contato();
        contato1.setNome("Felipe Duan");
        contato1.setEmail("hugostoso@gmail.com");
        contato1.setTelefone("(86)99919-8111");

        Contato contato2 = new Contato();
        contato2.setNome("Duany Dreyton");
        contato2.setEmail("duany@gmail.com");
        contato2.setTelefone("(86)99964-3999");

        Contato contato3 = new Contato();
        contato3.setNome("Roneide Brito");
        contato3.setEmail("roneide@gmail.com");
        contato3.setTelefone("(86)99903-0432");

        // secao08.Agenda
        Agenda agenda = new Agenda();

        // Armazenando Contatos - void armazenarContato(secao08.Contato contato);
        agenda.armazenarContato(contato1);
        agenda.armazenarContato(contato2);
        agenda.armazenarContato(contato3);

        // Imprimindo secao08.Agenda - void imprimeAgenda();
        agenda.imprimeAgenda();

        // Imprimindo secao08.Contato - void imprimeContato(int index);
        agenda.imprimeContato(1); // Duany Dreyton

        // Buscando contato - int buscaContato(String nome);
        System.out.println("A posição deste contato é: " + agenda.buscaContato("Felipe Duan"));

        // Removendo contato - void removeContato(secao08.Contato contato);
        agenda.removeContato(contato3); // Roneide Brito

        // Imprimindo secao08.Agenda - void imprimeAgenda();
        agenda.imprimeAgenda();

    }
}
