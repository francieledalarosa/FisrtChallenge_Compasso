import core.Funcionario;
import ui.ManagerUI;
import java.util.Scanner;

public class BonusApp {
    public static void main(String[] args) {
        int quantidadeFuncionarios = ui.ManagerUI.obterQuantidadeFuncionarios();
        Funcionario[] funcionarios = new Funcionario[quantidadeFuncionarios];

        for (int i = 0; i < quantidadeFuncionarios; i++) {
            System.out.println("Funcionário " + (i + 1));
            funcionarios[i] = new Funcionario();
            funcionarios[i].lerDados(new Scanner(System.in));
            funcionarios[i].calcularBonusDesconto();
        }

        ManagerUI.exibirResultados(funcionarios);
    }
}
