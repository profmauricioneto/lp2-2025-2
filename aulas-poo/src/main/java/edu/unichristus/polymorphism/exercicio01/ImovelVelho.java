package edu.unichristus.polymorphism.exercicio01;

public class ImovelVelho extends Imovel {
    private double desconto;

    public ImovelVelho(double preco, double desconto) {
        super(preco);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

//    public double calcularImovelVelho() {
//        return (getPreco() - getPreco()*desconto);
//    }

    @Override
    public double calcularImovel() {
        return (getPreco() - getPreco()*desconto);
    }
}
