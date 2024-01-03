import java.util.List;
import quizapp.ui.QuizUI;

public class QuizApp {
    public static void main(String[] args) {
        
        QuizUI quizUI = new QuizUI();

       
        quizUI.iniciarQuiz();

        
        List<String> respostasEscolhidas = quizUI.getRespostasEscolhidas();
        String nomeUsuario = quizUI.getNomeUsuario();

        
        System.out.println("\nRespostas Escolhidas por " + nomeUsuario + ":");
        for (int i = 0; i < respostasEscolhidas.size(); i++) {
            System.out.println("Pergunta " + (i + 1) + ": " + respostasEscolhidas.get(i));
        }

        System.out.println("\nResultado:");
        for (int i = 0; i < respostasEscolhidas.size(); i++) {
            boolean acertou = quizUI.verificarResposta(i, respostasEscolhidas.get(i));
            System.out.println("Pergunta " + (i + 1) + ": " + (acertou ? "Correto" : "Errado"));
        }

        System.out.println("\nFim de game!");
    }
}
