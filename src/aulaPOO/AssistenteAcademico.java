package aulaPOO;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AssistenteAcademico {
    public static void main(String[] args) {
        // Criando o mapa de perguntas e respostas da BNCC
        Map<String, String> bnccPerguntasRespostas = new HashMap<>();

        // Alimentando o mapa com algumas perguntas e respostas
        bnccPerguntasRespostas.put("Quais são as áreas do conhecimento no Ensino Médio?",
                "As áreas do conhecimento são: Linguagens e suas Tecnologias, Matemática e suas Tecnologias, Ciências da Natureza e suas Tecnologias, e Ciências Humanas e Sociais Aplicadas.");

        bnccPerguntasRespostas.put("O que é a BNCC?",
                "A BNCC (Base Nacional Comum Curricular) é um documento que define os conteúdos mínimos obrigatórios que devem ser ensinados nas escolas brasileiras.");

        bnccPerguntasRespostas.put("Quais são os componentes curriculares de Linguagens no Ensino Médio?",
                "Os componentes curriculares de Linguagens incluem: Língua Portuguesa, Língua Inglesa, Educação Física, Arte e Língua Espanhola.");

        // Continuando com o restante do código
        Scanner scanner = new Scanner(System.in);
        String pergunta;

        System.out.println("Olá! Eu sou seu assistente acadêmico.");
        while (true) {
            System.out.print("Faça uma pergunta: ");
            pergunta = scanner.nextLine();

            if (pergunta.equalsIgnoreCase("sair")) {
                System.out.println("Até logo!");
                break;
            } else
                System.out.println(bnccPerguntasRespostas.getOrDefault(pergunta, "Ainda não sei a resposta para isso."));
        }
    }
}
