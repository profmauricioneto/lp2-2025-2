package edu.unichristus.abstractclass.exercicio02;

public class Developer extends Employee {
    @Override
    public double increaseSalary() {
        return (salary + salary*0.8);
    }
}
