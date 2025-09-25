package edu.unichristus.polymorphism.exercicio01;

public class ImovelNovoCorretor extends ImovelNovo {
    private double corretagem;

    public ImovelNovoCorretor(double preco, double adicional, double corretagem) {
        super(preco, adicional);
        this.corretagem = corretagem;
    }

    @Override
    public double calculoImovelNovo() {
        return (super.calculoImovelNovo() + getPreco()*corretagem);
    }
}
