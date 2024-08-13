package secao11;

@SuppressWarnings("ALL")
public class Professor extends Pessoa{
    private String matricula;

    public Professor(String nome, int ano_nascimento, String email, String matricula) {
        super(nome, ano_nascimento, email);
        this.matricula = matricula;
    }

    @Override
    public String getNome() {
        return "Professor: " + super.getNome();
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return super.toString() + " / Matrícula: " + this.matricula;
    }

    @Override
    public void outra_mensagem(String texto) {
        System.out.println(texto);
    }
}
