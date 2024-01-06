package core;

import java.util.Scanner;

public class Funcionario {
    private String nome;
    private double salario;
    private double bonusDesconto;
    private double salarioLiquido;

    public void lerDados(Scanner scanner) {
        System.out.print("Nome: ");
        nome = scanner.next();

        System.out.print("Salário: ");
        salario = scanner.nextDouble();
    }

    public void calcularBonusDesconto() {
        bonusDesconto = BonusCalculator.calcularBonusDesconto(salario);
        salarioLiquido = salario + bonusDesconto;
    }

    public void exibirDados() {
        String tipo = (bonusDesconto >= 0) ? "Bônus" : "Desconto";
        double valor = Math.abs(bonusDesconto);

        double bonus = (tipo.equals("Bônus")) ? valor : 0;
        double desconto = (tipo.equals("Desconto")) ? valor : 0;

        System.out.printf("%-15s%-15.2f%-15s%-15s%-15.2f\n", nome, salario, tipo, (tipo.equals("Desconto") ? String.format("%.2f", desconto) : ""), salarioLiquido);
    }
}
