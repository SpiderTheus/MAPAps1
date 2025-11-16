package com.spider;

public class Produto {
    private String nome;
    private double preco;
    private int qtdEstoque;
    private String categoria;
    private double valorTotalEstoque;

    public Produto(String nome, double preco, int qtdEstoque, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
        this.categoria = categoria;
        this.valorTotalEstoque = calcularValorTotalEstoque();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getqtdEstoque() {
        return qtdEstoque;
    }

    public void setqtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getValorTotalEstoque() {
        return valorTotalEstoque;
    }
    
    public void setValorTotalEstoque(double valorTotalEstoque) {
        this.valorTotalEstoque = valorTotalEstoque;
    }

    public double calcularValorTotalEstoque() {
        return this.preco * this.qtdEstoque;
    }

    public String toString() {
        return "\nProduto [nome=" + nome + ", preço=" + preco + ", quantidade no estoque=" + qtdEstoque + ", categoria=" + categoria
                + ", valor total no estoque=" + valorTotalEstoque + "]";
    }
}
