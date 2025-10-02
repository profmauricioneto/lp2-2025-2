package edu.unichristus.abstractclass.exercicio01;

public class Main {
    public static void main(String[] args) {
        Product spiderman = new Toy("Homem Aranha", 500);
        spiderman.showInfo();

        Product bolaQuadrada = new Ball("Bola Quadrada do Kiko", 100);
        bolaQuadrada.showInfo();
    }
}
