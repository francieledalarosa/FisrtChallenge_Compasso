package loja.core;  // Pacote alterado para refletir a estrutura

import java.util.ArrayList;

import loja.Produto;
    
public class EstoqueManager {
    private ArrayList<loja.Produto> produtos;
    

    public EstoqueManager(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado ao estoque com sucesso.");
    }

    public void removerProduto(int codigoProduto) {
        Produto produtoRemovido = encontrarProdutoPorCodigo(codigoProduto);
        if (produtoRemovido != null) {
            produtos.remove(produtoRemovido);
            System.out.println("Produto removido com sucesso.");
        } else {
            System.out.println("Produto não encontrado.");
        }
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

    public void cadastrarNovoProduto(String nome, int codigo, double preco, int quantidadeEmEstoque) {
        Produto novoProduto = new Produto(nome, codigo, preco, quantidadeEmEstoque);
        produtos.add(novoProduto);
        System.out.println("Produto cadastrado com sucesso: " + novoProduto);

    }
}
