package edu.unichristus.abstractclass.exercicio02;

public abstract class Employee {
    protected String name;
    protected double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract double increaseSalary();
}
