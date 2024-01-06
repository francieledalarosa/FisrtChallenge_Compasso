package loja;

import java.util.ArrayList;

public class Produto {
    private String nome;
    private int codigo;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, int codigo, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void vender(int quantidadeVenda) {
        if (quantidadeVenda > 0 && quantidadeVenda <= quantidadeEmEstoque) {
            quantidadeEmEstoque -= quantidadeVenda;
            System.out.println(quantidadeVenda + " unidades de " + nome + " foram vendidas.");
            System.out.println("Quantidade em estoque atualizada: " + quantidadeEmEstoque);
        } else {
            System.out.println("Quantidade inválida para venda.");
        }
    }

    public void comprar(int quantidadeCompra) {
        if (quantidadeCompra > 0) {
            quantidadeEmEstoque += quantidadeCompra;
            System.out.println(quantidadeCompra + " unidades de " + nome + " foram compradas.");
            System.out.println("Quantidade em estoque atualizada: " + quantidadeEmEstoque);
        } else {
            System.out.println("A quantidade comprada deve ser maior que zero.");
        }
    }

    public void alterarPreco(double novoPreco) {
        this.preco = novoPreco;
        System.out.println("Preço do produto atualizado com sucesso.");
    }

    public void alterarQuantidadeEmEstoque(int novaQuantidade) {
        this.quantidadeEmEstoque = novaQuantidade;
        System.out.println("Quantidade em estoque do produto atualizada com sucesso.");
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }
}

class EstoqueManager {
    private ArrayList<Produto> produtos;

    public EstoqueManager(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public void cadastrarNovoProduto(String nome, int codigo, double preco, int quantidadeEmEstoque) {
        Produto novoProduto = new Produto(nome, codigo, preco, quantidadeEmEstoque);
        produtos.add(novoProduto);
        System.out.println("Novo produto cadastrado com sucesso!");
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            for (Produto produto : produtos) {
                System.out.println("Código: " + produto.getCodigo() +
                                   ", Nome: " + produto.getNome() +
                                   ", Preço: " + produto.getPreco() +
                                   ", Quantidade em Estoque: " + produto.getQuantidadeEmEstoque());
            }
        }
    }

    public Produto encontrarProdutoPorCodigo(int codigoProduto) {
        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigoProduto) {
                return produto;
            }
        }
        return null;
    }
}
