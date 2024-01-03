package com.compasso.estoque.app;
import com.compasso.estoque.Produto;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de gerenciamento de estoque!");

        
        System.out.print("Deseja cadastrar um novo produto? (S/N): ");
        String resposta = scanner.next();

        if (resposta.equalsIgnoreCase("S")) {
            
            System.out.print("Digite o nome do produto: ");
            String nome = scanner.next();

            System.out.print("Digite o código do produto: ");
            int codigo = scanner.nextInt();

            System.out.print("Digite o preço do produto: ");
            double preco = scanner.nextDouble();

            System.out.print("Digite a quantidade em estoque: ");
            int quantidadeEmEstoque = scanner.nextInt();

           
            Produto novoProduto = new Produto(nome, codigo, preco, quantidadeEmEstoque);

            
            System.out.println("Novo produto cadastrado:");
            System.out.println("Nome: " + novoProduto.getNome());
            System.out.println("Código: " + novoProduto.getCodigo());
            System.out.println("Preço: " + novoProduto.getPreco());
            System.out.println("Quantidade em Estoque: " + novoProduto.getQuantidadeEmEstoque());
        } else {
            System.out.println("Operação cancelada. Encerrando o programa.");
        }

       
        scanner.close();
    }
}