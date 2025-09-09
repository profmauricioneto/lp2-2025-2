package edu.unichristus.inheritance.exercicio07;

public class Pessoa {
    private int id;
    protected String nome;
    private Departamento departamento;

    public Pessoa(int id, Departamento departamento) {
        this.id = id;
        this.departamento = departamento;
    }

    protected int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
