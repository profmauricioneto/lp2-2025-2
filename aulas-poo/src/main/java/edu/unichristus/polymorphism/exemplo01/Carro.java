package edu.unichristus.polymorphism.exemplo01;

public class Carro extends Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Carro acelerando...");
    }

    @Override
    public void frear() {
        System.out.println("Carro frenando...");
    }

    public void metodoCarro() {
        System.out.println("Metodo pra testar acesso.");
    }
}
