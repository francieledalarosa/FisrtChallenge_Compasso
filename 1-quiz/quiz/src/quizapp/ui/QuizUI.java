package quizapp.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import quizapp.core.Quiz;

public class QuizUI {
    private Scanner scanner;
    private Quiz quiz;
    private List<String> respostasEscolhidas;
    private String nomeUsuario;

    public QuizUI() {
        scanner = new Scanner(System.in);
        quiz = new Quiz();
        respostasEscolhidas = new ArrayList<>();
    }

    public void iniciarQuiz() {
        System.out.print("Digite seu nome: ");
        nomeUsuario = scanner.nextLine();

        System.out.println("Bem-vindo ao Quiz do programador!");

        for (int i = 0; i < quiz.size(); i++) {
            String pergunta = quiz.obterPergunta(i);
            System.out.println(pergunta);

            System.out.print("Sua resposta: ");
            String respostaUsuario = scanner.nextLine();
            respostasEscolhidas.add(respostaUsuario);

            String respostaCorreta = quiz.obterResposta(i);

            if (respostaUsuario.equalsIgnoreCase(respostaCorreta)) {
                System.out.println("Correto!");
            } else {
                System.out.println("Errado! A resposta correta é: " + respostaCorreta);
            }
        }
    }

    public List<String> getRespostasEscolhidas() {
        return respostasEscolhidas;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public boolean verificarResposta(int i, String respostaUsuario) {
        String respostaCorreta = quiz.obterResposta(i);
        return respostaUsuario.equalsIgnoreCase(respostaCorreta);
    }
}
