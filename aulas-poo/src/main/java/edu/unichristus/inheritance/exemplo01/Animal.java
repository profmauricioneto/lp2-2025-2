package edu.unichristus.inheritance.exemplo01;

public class Animal {
    public int quantidadePatas;

    public Animal(int quantidadePatas) {
        this.quantidadePatas = quantidadePatas;
        System.out.println("Inicializando o animal...");
    }

    public void comer() {
        System.out.println("Animal Comendo!");
    }
}
