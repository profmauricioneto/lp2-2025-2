package edu.unichristus.polymorphism.exemplo01;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Carro();
        veiculo.acelerar();
        veiculo = new Caminhao();
        veiculo.acelerar();
        veiculo = new Veiculo();
        veiculo.acelerar();

        veiculo = new Carro();
//        veiculo.metodoCarro();
    }
}
