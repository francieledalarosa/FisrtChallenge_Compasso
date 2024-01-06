package br.compasso.sistemaAutenticacao.main;

import br.compasso.sistemaAutenticacao.ui.AutenticacaoUI;

import java.util.Scanner;

public class LoginApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean respostaValida = false;
        String respostaCadastro = "";

        while (!respostaValida) {
            System.out.print("Você já possui cadastro? (S/N): ");
            respostaCadastro = scanner.nextLine().trim().toLowerCase();

            if (respostaCadastro.equals("s") || respostaCadastro.equals("n")) {
                respostaValida = true;
            } else {
                System.out.println("Resposta inválida. Por favor, responda com S ou N.");
            }
        }

        if (respostaCadastro.equals("s")) {
            AutenticacaoUI.realizarLogin();
        } else if (respostaCadastro.equals("n")) {
            AutenticacaoUI.realizarCadastro();
        }

        scanner.close();
    }
}
