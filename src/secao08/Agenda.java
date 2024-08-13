package secao08;

import java.util.ArrayList;

@SuppressWarnings("ALL")
public class Agenda {
    ArrayList<Contato> contatos = new ArrayList<Contato>();

    void armazenarContato(Contato contato) {
        this.contatos.add(contato);
    }

    void removeContato(Contato contato) {
        this.contatos.remove(contato);
    }

    int buscaContato(String nome) {
        // Informa em que posição da agenda está o contato
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getNome() == nome) {
                return i;
            }
        }
        return -1;
    }

    void imprimeAgenda() {
        System.out.println("============== secao08.Agenda ==============");
        for (Contato contato : contatos) {
            contato.imprimir();
        }
        System.out.println("============== Fim ==============");
    }
    void imprimeContato(int index) {
        contatos.get(index).imprimir();
    }
}
