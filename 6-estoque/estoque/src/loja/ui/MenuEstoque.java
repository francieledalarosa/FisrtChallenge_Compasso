package loja.ui;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import loja.core.EstoqueManager;
import loja.Produto; 

public class MenuEstoque {
    private static Scanner scanner = new Scanner(System.in);
    private static EstoqueManager estoqueManager = new EstoqueManager(new ArrayList<>());

    public static void main(String[] args) {
        int opcao;

        do {
            exibirMenu();
            opcao = lerOpcao();

            switch (opcao) {
                case 1:
                    estoqueManager.listarProdutos();
                    break;
                case 2:
                    cadastrarNovoProduto();
                    break;
                case 3:
                    venderProduto();
                    break;
                case 4:
                    comprarProduto();
                    break;
                case 5:
                    alterarPrecoProduto();
                    break;
                case 6:
                    alterarQuantidadeEmEstoqueProduto();
                    break;
                case 0:
                    System.out.println("Saindo do programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);
    }

    private static void exibirMenu() {
        System.out.println("Menu Estoque Compasso");
        System.out.println("Digite o número da operação desejada:");
        System.out.println("1 - Ver produtos");
        System.out.println("2 - Cadastrar novo produto");
        System.out.println("3 - Vender");
        System.out.println("4 - Comprar");
        System.out.println("5 - Alterar preço");
        System.out.println("6 - Alterar quantidade em estoque");
        System.out.println("0 - Sair");
    }

    private static int lerOpcao() {
        int opcao = -1;

        try {
            opcao = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Por favor, insira um número válido.");
            scanner.nextLine();
        }

        return opcao;
    }

    private static void cadastrarNovoProduto() {
        System.out.println("Digite o nome do produto:");
        String nome = scanner.next();

        System.out.println("Digite o código do produto:");
        int codigo = scanner.nextInt();

        double preco = lerDoublePositivo("Digite o preço do produto:");

        int quantidadeEmEstoque = lerInteiroPositivo("Digite a quantidade em estoque do produto:");

        estoqueManager.cadastrarNovoProduto(nome, codigo, preco, quantidadeEmEstoque);
        System.out.println("Produto cadastrado com sucesso!");
    }

    private static void venderProduto() {
        int codigo = lerInteiroPositivo("Digite o código do produto que deseja vender:");
        Produto produto = estoqueManager.encontrarProdutoPorCodigo(codigo);

        if (produto != null) {
            int quantidadeVenda = lerQuantidade("Digite a quantidade que deseja vender:");
            produto.vender(quantidadeVenda);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    private static void comprarProduto() {
        int codigo = lerInteiroPositivo("Digite o código do produto que deseja comprar:");
        Produto produto = estoqueManager.encontrarProdutoPorCodigo(codigo);

        if (produto != null) {
            int quantidadeCompra = lerQuantidade("Digite a quantidade que deseja comprar:");
            produto.comprar(quantidadeCompra);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    private static void alterarPrecoProduto() {
        int codigo = lerInteiroPositivo("Digite o código do produto que deseja alterar o preço:");
        Produto produto = estoqueManager.encontrarProdutoPorCodigo(codigo);

        if (produto != null) {
            double novoPreco = lerDoublePositivo("Digite o novo preço:");
            produto.alterarPreco(novoPreco);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    private static void alterarQuantidadeEmEstoqueProduto() {
        int codigo = lerInteiroPositivo("Digite o código do produto que deseja alterar a quantidade em estoque:");
        Produto produto = estoqueManager.encontrarProdutoPorCodigo(codigo);

        if (produto != null) {
            int novaQuantidade = lerQuantidade("Digite a nova quantidade em estoque:");
            produto.alterarQuantidadeEmEstoque(novaQuantidade);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    private static double lerDoublePositivo(String mensagem) {
        double valor = -1;

        while (valor < 0) {
            try {
                System.out.println(mensagem);
                valor = scanner.nextDouble();
                if (valor < 0) {
                    System.out.println("O valor deve ser não negativo. Tente novamente:");
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um valor numérico válido.");
                scanner.nextLine();
            }
        }

        return valor;
    }

    private static int lerInteiroPositivo(String mensagem) {
        int valor = -1;

        while (valor < 0) {
            try {
                System.out.println(mensagem);
                valor = scanner.nextInt();
                if (valor < 0) {
                    System.out.println("O valor deve ser não negativo. Tente novamente:");
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um valor numérico válido.");
                scanner.nextLine();
            }
        }

        return valor;
    }

    private static int lerQuantidade(String mensagem) {
        int quantidade = -1;

        while (quantidade <= 0) {
            try {
                System.out.println(mensagem);
                quantidade = scanner.nextInt();
                if (quantidade <= 0) {
                    System.out.println("A quantidade deve ser maior que zero. Tente novamente:");
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um valor numérico válido para a quantidade.");
                scanner.nextLine();
            }
        }

        return quantidade;
    }
}
