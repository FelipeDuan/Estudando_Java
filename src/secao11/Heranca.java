package secao11;
// Aula sobre Herança em POO
public class Heranca {
    public static void main(String[] args) {
        // toString()
        // Ex: p1 == p1.toString()

//        Pessoa p1 = new Pessoa("Felipe Duan", 2005, "hugostoso@gmail.com");
//        System.out.println(p1.getNome());
//        System.out.println(p1);
//        System.out.println();

        Aluno a1 = new Aluno("Luís Eduardo", 2010, "luis@gmail.com","123456");
        System.out.println(a1.getNome());
        System.out.println(a1);
        System.out.println();

        Professor prof1 = new Professor("Duany Dreyton", 1979,"duany@gmail.com","ABC123");
        System.out.println(prof1.getNome());
        System.out.println(prof1);
        System.out.println();
    }
}
