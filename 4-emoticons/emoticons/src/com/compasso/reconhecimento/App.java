package com.compasso.reconhecimento;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Olá, como foi seu dia? ");
        String mensagem = scanner.nextLine();

        Emoticons analyzer = new Emoticons();
        String sentimento = analyzer.determinarSentimento(mensagem);

        System.out.println("Sentimento expresso na mensagem: " + sentimento);

        scanner.close();
    }
}