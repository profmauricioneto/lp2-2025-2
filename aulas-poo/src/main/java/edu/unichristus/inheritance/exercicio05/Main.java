package edu.unichristus.inheritance.exercicio05;

public class Main {
    public static void main(String[] args) {
        Funcionario littleJonh = new Funcionario(1, "Little Jonh");
        Cliente mary = new Cliente(2, "Mary");

        Venda compraBatata = new Venda(123, mary, littleJonh);
        littleJonh.addVenda(compraBatata);
        mary.addCompra(compraBatata);

        mary.listarCompras();
    }
}
