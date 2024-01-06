package br.compasso.sistemaAutenticacao.ui;

import br.compasso.sistemaAutenticacao.core.AutenticacaoService;
import java.time.LocalTime;
import java.util.Scanner;

public class AutenticacaoUI {

    public static void realizarLogin() {
        Scanner scanner = new Scanner(System.in);
    
        boolean loginSucesso = false;
        int tentativasRestantes = 3;
    
        while (!loginSucesso && tentativasRestantes > 0) {
            System.out.print("\nDigite o usuário: ");
            String usuarioDigitado = scanner.nextLine();
            System.out.print("Digite a senha: ");
            String senhaDigitada = scanner.nextLine();
    
            int indiceUsuarioAutenticado = AutenticacaoService.autenticarUsuario(usuarioDigitado, senhaDigitada);
    
            if (indiceUsuarioAutenticado != -1) {
                exibirMensagemSaudacao();
                loginSucesso = true;
            } else {
                tentativasRestantes--;
    
                if (tentativasRestantes > 0) {
                    System.out.println("\nUsuário e/ou senha incorretos. Tentativas restantes: " + tentativasRestantes);
                    
                    String tentarNovamente;
                    do {
                        System.out.print("Deseja tentar novamente? (S/N): \n");
                        tentarNovamente = scanner.nextLine().trim().toLowerCase();
                    } while (!tentarNovamente.equals("s") && !tentarNovamente.equals("n"));
    
                    if (!tentarNovamente.equals("s")) {
                        
                        System.out.println("\nObrigado pela visita! Encerrando o programa.");
                        break;  
                    }
                } else {
                    System.out.println("Número máximo de tentativas atingido. Encerrando o programa.");
                }
            }
        }
    
        scanner.close();
    }
    
    public static void realizarCadastro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Olá, realizaremos seu cadastro.");
        System.out.print("Digite o nome para criação de usuário: ");
        String novoUsuario = scanner.nextLine();
        System.out.print("Crie uma senha: ");
        String novaSenha = scanner.nextLine();

        AutenticacaoService.cadastrarUsuario(novoUsuario, novaSenha);

        System.out.println();
        System.out.println("Cadastro realizado com sucesso! Realize o login.");
        realizarLogin();

        scanner.close();
    }

    private static void exibirMensagemSaudacao() {
        LocalTime horaAtual = LocalTime.now();

        System.out.println();
        if (horaAtual.isAfter(LocalTime.of(6, 0)) && horaAtual.isBefore(LocalTime.of(12, 0))) {
            System.out.println("Bom dia, você se logou ao nosso sistema.");
        } else if (horaAtual.isAfter(LocalTime.of(12, 0)) && horaAtual.isBefore(LocalTime.of(19, 0))) {
            System.out.println("Boa tarde, você se logou ao nosso sistema.");
        } else if (horaAtual.isAfter(LocalTime.of(19, 0)) || horaAtual.isBefore(LocalTime.of(23, 59))) {
            System.out.println("Boa noite, você se logou ao nosso sistema.");
        } else {
            System.out.println("Boa madrugada, você se logou ao nosso sistema.");
        }
    }
}

