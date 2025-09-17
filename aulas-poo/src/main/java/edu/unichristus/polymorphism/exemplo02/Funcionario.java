package edu.unichristus.polymorphism.exemplo02;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome) {
        super(nome);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public void imprimir() {
        System.out.println("Funcionario: " + getNome());
    }
}
