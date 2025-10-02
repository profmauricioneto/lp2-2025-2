package edu.unichristus.polymorphism.exercicio01;

public class ImovelNovo extends Imovel {
    private double adicional;

    public ImovelNovo(double preco, double adicional) {
        super(preco);
        this.adicional = adicional;
    }

    public double getAdicional() {
        return adicional;
    }

//    public double calculoImovelNovo() {
//        return (getPreco() + getPreco()*adicional);
//    }
    @Override
    public double calcularImovel() {
        return (getPreco() + getPreco()*adicional);
    }
}
