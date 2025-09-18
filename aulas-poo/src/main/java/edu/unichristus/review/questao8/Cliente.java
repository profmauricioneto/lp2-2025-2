package edu.unichristus.review.questao8;

public class Cliente {
    public String nome;
    public String endereco;
    public Conta conta;

    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Conta getConta() {
        return conta;
    }

}
