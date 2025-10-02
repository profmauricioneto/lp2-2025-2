package edu.unichristus.abstractclass.exercicio01;

public abstract class Product {
    public String name;
    public double price;
    public int id;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public abstract void update(String name, double price);
    public abstract void showInfo();

}
