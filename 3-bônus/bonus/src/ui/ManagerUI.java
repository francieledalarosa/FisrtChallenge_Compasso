package ui;

import core.Funcionario;

import java.util.Scanner;

public class ManagerUI {
    public static int obterQuantidadeFuncionarios() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a quantidade de funcionários: ");
        return scanner.nextInt();
    }

    public static void exibirResultados(Funcionario[] funcionarios) {
        System.out.println("\nResultados:");
        System.out.printf("%-15s%-15s%-20s%-15s\n", "Funcionário", "Salário", "Bônus/Desconto", "Salário Líquido");

        for (Funcionario funcionario : funcionarios) {
            funcionario.exibirDados();
        }
    }
}
