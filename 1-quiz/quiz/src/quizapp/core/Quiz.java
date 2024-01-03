package quizapp.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Quiz {
    private List<String> perguntas;
    private Map<String, String> alternativas; 
    private Map<String, String> respostas;

    public Quiz() {
        perguntas = new ArrayList<>();
        alternativas = new HashMap<>();
        respostas = new HashMap<>();
        inicializarPerguntasEAlternativas();
    }

    private void inicializarPerguntasEAlternativas() {
        
        perguntas.add("Qual é a linguagem de programação mais utilizada para desenvolvimento web?");
        alternativas.put("Qual é a linguagem de programação mais utilizada para desenvolvimento web?", "a) Python  b) Java  c) JavaScript");
        respostas.put("Qual é a linguagem de programação mais utilizada para desenvolvimento web?", "c");
        
        perguntas.add("O que significa a sigla HTML?");
        alternativas.put("O que significa a sigla HTML?", "a) HyperText Markup Language  b) High-Level Text Management Language  c) HyperTransfer Markup Language");
        respostas.put("O que significa a sigla HTML?", "a");

        perguntas.add("O que é um loop 'for' em programação?");
        alternativas.put("O que é um loop 'for' em programação?", "a) Uma condição de decisão  b) Uma estrutura de repetição  c) Um tipo de variável");
        respostas.put("O que é um loop 'for' em programação?", "b");
        
    }

    public String obterPergunta(int indice) {
        if (indice >= 0 && indice < perguntas.size()) {
            return perguntas.get(indice) + "\n" + alternativas.get(perguntas.get(indice));
        }
        return null;
    }

    public boolean verificarResposta(int indice, String respostaUsuario) {
        if (indice >= 0 && indice < respostas.size()) {
            return respostas.get(perguntas.get(indice)).equalsIgnoreCase(respostaUsuario);
        }
        return false;
    }

    public int size() {
        return perguntas.size();
    }

    public String obterResposta(int i) {
        return respostas.get(perguntas.get(i));
    }
}
