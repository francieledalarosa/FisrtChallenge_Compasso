package core;

public class BonusCalculator {
    public static double calcularBonusDesconto(double salario) {
        if (salario <= 1000) {
            return salario * 0.2; // 20% de bonificação
        } else if (salario <= 2000) {
            return salario * 0.1; // 10% de bonificação
        } else {
            return salario * 0.1 * -1; // 10% de desconto
        }
    }
}
