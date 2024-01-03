package com.compasso.estoque;

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

    public int getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
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
    

    public void vender(int quantidadeVenda) {
       
        if(quantidadeVenda > 0) {

            quantidadeEmEstoque -= quantidadeVenda;
            System.out.println(quantidadeVenda + " unidades de " + nome + " foram vendidas. ");
            System.out.println("Quantidade em estoque atualizada: " + quantidadeEmEstoque);

        } else {
            System.out.println("A quantidade vendida deve ser maior que zero.");
        }
    }

    
}
