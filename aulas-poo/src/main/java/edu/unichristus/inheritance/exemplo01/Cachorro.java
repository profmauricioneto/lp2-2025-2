package edu.unichristus.inheritance.exemplo01;

public class Cachorro extends Animal {
    public int quantidadePatas;

    public Cachorro(int quantidadePatas) {
        super(quantidadePatas);
    }

    @Override
    public void comer() {
        System.out.println("Cachorro comendo.");
    }
}
