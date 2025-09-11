package edu.unichristus.inheritance.exercicio04;

public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String cpf, int id, Departamento  departamento) {
        super(id, departamento);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
