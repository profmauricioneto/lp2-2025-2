package edu.unichristus.abstractclass.exercicio02;

public class Main {
    public static void main(String[] args) {
        Employee mauricio = new Developer();
        mauricio.setName("mauricio");
        mauricio.setSalary(1000);

        System.out.println("Salario Dev mauricio: " + mauricio.increaseSalary());

        mauricio = new Manager();
        mauricio.setName("mauricio");
        mauricio.setSalary(1000);
        System.out.println("Salario Gerente mauricio: " + mauricio.increaseSalary());

    }
}
