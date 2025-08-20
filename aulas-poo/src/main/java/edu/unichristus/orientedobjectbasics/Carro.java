package edu.unichristus.orientedobjectbasics;

public class Carro {
    int quantidadePneus;
    int quantidadePortas;
    String cor;

    public Carro(int quantidadePneus, int quantidadePortas, String cor) {
        System.out.println("Criando um objeto de Carro.");
        this.quantidadePneus = quantidadePneus;
        this.quantidadePortas = quantidadePortas;
        this.cor = cor;
    }

    public void acelerar() {
        System.out.println("Acelerando!");
    }

    public void frear() {
        System.out.println("Parando!");
    }

    public void infoCarro() {
        System.out.println("Qtd Portas: " + quantidadePortas);
        System.out.println("Qtd Pneus: " + quantidadePneus);
        System.out.println("Cor: " + cor);
    }
}
