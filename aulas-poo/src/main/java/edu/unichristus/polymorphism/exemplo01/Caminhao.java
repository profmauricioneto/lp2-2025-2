package edu.unichristus.polymorphism.exemplo01;

public class Caminhao extends Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Caminhão acelerando...");
    }

    @Override
    public void frear() {
        System.out.println("Caminhão frenando...");
    }
}
