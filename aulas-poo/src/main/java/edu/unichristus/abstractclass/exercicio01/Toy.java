package edu.unichristus.abstractclass.exercicio01;

public class Toy extends Product {
    public Toy(String name, double price) {
        super(name, price);
    }

    @Override
    public void update(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showInfo() {
        System.out.println("Produto: " + name);
        System.out.println("Valor: " + price);
    }
}
