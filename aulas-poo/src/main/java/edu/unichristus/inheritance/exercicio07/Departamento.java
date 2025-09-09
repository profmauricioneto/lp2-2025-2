package edu.unichristus.inheritance.exercicio07;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private int id;
    public String descricao;
    private List<Pessoa> pessoas;

    public Departamento(int id) {
        this.id = id;
        this.pessoas = new ArrayList<>();
    }

    public void addPessoa(Pessoa pessoa) {
        this.pessoas.add(pessoa);
    }

    protected int getId() {
        return id;
    }
}
