package com.compasso.reconhecimento;

public class Emoticons {
    public String determinarSentimento(String mensagem) {
    
        int divertido = contarEmoticons(mensagem, ":-)");
        int chateado = contarEmoticons(mensagem, ":-(");

       
        if (divertido == chateado) {
            return "Neutro";
        } else if (divertido > chateado) {
            return "Divertido";
        } else {
            return "Chateado";
        }
    }

    private int contarEmoticons(String mensagem, String emoticon) {
        int contador = 0;
        int index = mensagem.indexOf(emoticon);

        while (index != -1) {
            contador++;
            index = mensagem.indexOf(emoticon, index + 1);
        }

        return contador;
    }
}

