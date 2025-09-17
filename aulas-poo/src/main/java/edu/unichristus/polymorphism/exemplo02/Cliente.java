package edu.unichristus.polymorphism.exemplo02;

public class Cliente extends Pessoa {
    private String cpf;

    public Cliente(String nome) {
        super(nome);
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public void imprimir() {
        System.out.println("Cliente: " + getNome());
    }
}

