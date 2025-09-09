package edu.unichristus.inheritance.exemplo02;

public class Funcionario {
    private String nome;
    private double salario;
    private int dependentes;

    public Funcionario(String nome, double salario, int dependentes) {
        this.nome = nome;
        this.salario = salario;
        this.dependentes = dependentes;
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        this.dependentes = 0;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + salario);
        System.out.println("Dependentes: " + dependentes);
    }
}
