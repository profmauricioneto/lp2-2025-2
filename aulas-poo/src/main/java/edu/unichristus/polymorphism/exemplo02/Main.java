package edu.unichristus.polymorphism.exemplo02;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Funcionario("Little Jonh");
        Funcionario p2 = (Funcionario) p1;
        p2.imprimir();
    }
}
