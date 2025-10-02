package edu.unichristus.abstractclass.exercicio01;

public class Ball extends Product {
    public Ball (String name, double price) {
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
