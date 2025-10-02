package edu.unichristus.polymorphism.exercicio01;

public class Imovel {
    private double preco;
    protected String endereco;

    public Imovel(double preco) {
        this.preco = preco;
        this.endereco = "";
    }

    public double getPreco() {
        return preco;
    }

    public double calcularImovel() {
        return preco;
    }
}
