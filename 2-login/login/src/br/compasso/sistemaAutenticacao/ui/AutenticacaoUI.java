package br.compasso.sistemaAutenticacao.ui;

import br.compasso.sistemaAutenticacao.core.AutenticacaoService;

import java.util.Scanner;
import java.time.LocalTime;

public class AutenticacaoUI {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o usuário: ");
        String usuarioDigitado = scanner.nextLine();
        System.out.print("Digite a senha: ");
        String senhaDigitada = scanner.nextLine();

       
        int indiceUsuarioAutenticado = AutenticacaoService.autenticarUsuario(usuarioDigitado, senhaDigitada);

       
        if (indiceUsuarioAutenticado != -1) {
            exibirMensagemSaudacao();
        } else {
            System.out.println("Usuário e/ou senha incorretos.");
        }

        
        scanner.close();
    }

   
    private static void exibirMensagemSaudacao() {
        LocalTime horaAtual = LocalTime.now();

        if (horaAtual.isAfter(LocalTime.of(6, 0)) && horaAtual.isBefore(LocalTime.of(12, 0))) {
            System.out.println("Bom dia, você se logou ao nosso sistema.");
        } else if (horaAtual.isAfter(LocalTime.of(12, 0)) && horaAtual.isBefore(LocalTime.of(18, 0))) {
            System.out.println("Boa tarde, você se logou ao nosso sistema.");
        } else if (horaAtual.isAfter(LocalTime.of(18, 0)) && horaAtual.isBefore(LocalTime.of(0, 0))) {
            System.out.println("Boa noite, você se logou ao nosso sistema.");
        } else {
            System.out.println("Boa madrugada, você se logou ao nosso sistema.");
        }
    }
}
