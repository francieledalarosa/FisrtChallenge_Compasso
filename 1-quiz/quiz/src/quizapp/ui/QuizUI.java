package ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;
import core.Quiz;

public class QuizUI {

    private Scanner scanner;
    private Quiz quiz;
    private List<String> respostasEscolhidas;
    private String nomeUsuario;
    private int pontuacao;

    public QuizUI(String nomeUsuario) {
        this.scanner = new Scanner(System.in);
        this.quiz = new Quiz();
        this.respostasEscolhidas = new ArrayList<>();
        this.nomeUsuario = nomeUsuario;
        this.pontuacao = 0;
    }

    public void iniciarQuiz() throws ExecutionException, IOException {
        System.out.println();
        System.out.println("Bem-vindo ao Quiz do programador, " + nomeUsuario + "!");
        System.out.println();

        for (int i = 0; i < quiz.size(); i++) {
            String pergunta = quiz.obterPergunta(i);
            System.out.println(pergunta);

            try {
                if (responderComTemporizador(i)) {
                    System.out.println("Correto!");
                    pontuacao += 10; // Adiciona 10 pontos por resposta correta
                } else {
                    System.out.println("Errado! A resposta correta é: " + quiz.obterResposta(i));
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println();
        }
    }

    private boolean responderComTemporizador(int indice) throws InterruptedException, IOException {
        final int TEMPO_LIMITE_SEGUNDOS = 20;

        System.out.println("\nVocê tem " + TEMPO_LIMITE_SEGUNDOS + " segundos para responder.");

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Boolean> future = executorService.submit(() -> {
            try {
                Thread.sleep(TEMPO_LIMITE_SEGUNDOS * 1000);
                return false;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return false;
            }
        });

        try {
            long tempoInicio = System.currentTimeMillis();
            boolean respostaLida = false;

            while (System.currentTimeMillis() - tempoInicio < TEMPO_LIMITE_SEGUNDOS * 1000) {
                if (System.in.available() > 0) {
                    respostaLida = true;
                    break;
                }
                Thread.sleep(100);
            }

            if (respostaLida) {
                System.out.print("\nSua resposta: ");
                String respostaUsuario = scanner.nextLine().trim().toLowerCase();

                if (quiz.validarResposta(indice, respostaUsuario)) {
                    future.cancel(true);
                    return quiz.verificarResposta(indice, respostaUsuario);
                } else {
                    System.out.println("\nSua resposta não foi válida (a, b, c).");
                    return false;
                }
            } else {
                System.out.println("\nTempo esgotado! A resposta será considerada incorreta.");
                return false;
            }
        } finally {
            executorService.shutdown();
        }
    }

    public List<String> getRespostasEscolhidas() {
        return respostasEscolhidas;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public int getPontuacao() {
        return pontuacao;
    }
}
