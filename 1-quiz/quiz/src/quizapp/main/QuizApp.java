package main;
import java.util.List;
import ui.QuizUI;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.io.IOException;
import java.util.ArrayList;

public class QuizApp {
    public static void main(String[] args) throws ExecutionException, IOException {
        Scanner scanner = new Scanner(System.in);

         System.out.println("QUIZ DO PROGRAMADOR!");

        int numeroJogadores = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("Digite o número de jogadores: ");
                numeroJogadores = Integer.parseInt(scanner.nextLine());
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, insira um número válido.");
            }
        }

        List<QuizUI> quizUIList = new ArrayList<>();
        for (int i = 0; i < numeroJogadores; i++) {
            System.out.print("Digite o nome do Jogador " + (i + 1) + ": ");
            String nomeJogador = scanner.nextLine();
            quizUIList.add(new QuizUI(nomeJogador));
        }

        for (QuizUI quizUI : quizUIList) {
            quizUI.iniciarQuiz();
        }

        exibirResultados(quizUIList);
        scanner.close();
    }

    private static void exibirResultados(List<QuizUI> quizUIList) {
        System.out.println("\nResultados finais:");

        int pontuacaoMaxima = 0;
        String jogadorVencedor = "";

        for (QuizUI quizUI : quizUIList) {
            int pontuacaoJogador = quizUI.getPontuacao();
            System.out.println(quizUI.getNomeUsuario() + ": " + pontuacaoJogador + " pontos");

            if (pontuacaoJogador > pontuacaoMaxima) {
                pontuacaoMaxima = pontuacaoJogador;
                jogadorVencedor = quizUI.getNomeUsuario();
            } else if (pontuacaoJogador == pontuacaoMaxima) {
                jogadorVencedor = "EMPATE!";
            }
        }
        System.out.println();
        System.out.println("\n-------------FIM DO JOGO!-------------");
        System.out.println("                    ____ \r\n" + //
                           "                  .'* *.'\r\n" + //
                           "               __/_*_*(_\r\n" + //
                           "              / _______ \\\r\n" + //
                           "             _\\_)/___\\(_/_ \r\n" + //
                           "            / _((\\- -/))_ \\\r\n" + //
                           "            \\ \\())(-)(()/ /\r\n" + //
                           "             ' \\(((()))/ '\r\n" + //
                           "            / ' \\)).))/ ' \\\r\n" + //
                           "           / _ \\ - | - /_  \\\r\n" + //
                           "          (   ( .;''';. .'  )\r\n" + //
                           "          _\\\"__ /    )\\ __\"/_\r\n" + //
                           "            \\/  \\   ' /  \\/\r\n" + //
                           "             .'  '...' ' )\r\n" + //
                           "              / /  |  \\ \\\r\n" + //
                           "             / .   .   . \\\r\n" + //
                           "            /   .     .   \\\r\n" + //
                           "           /   /   |   \\   \\\r\n" + //
                           "         .'   /    b    '.  '.\r\n" + //
                           "     _.-'    /     Bb     '-. '-._ \r\n" + //
                           " _.-'       |      BBb       '-.  '-. \r\n" + //
                           "(________mrf\\____.dBBBb.________)____)");
        System.err.println();
        System.out.println("\nParabéns " + jogadorVencedor + "!");
        System.out.println("Você é o mestre do quiz, o mago da programação!");
        System.err.println();
    }
}
