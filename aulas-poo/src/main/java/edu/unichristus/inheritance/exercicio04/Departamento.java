package edu.unichristus.inheritance.exercicio04;

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

    public void showPessoasDepartamento() {
        for (Pessoa pessoa: pessoas) {
            System.out.println(pessoa.getNome());
        }
    }
}
