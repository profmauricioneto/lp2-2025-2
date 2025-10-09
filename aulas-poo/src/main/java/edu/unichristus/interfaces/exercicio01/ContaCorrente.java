package edu.unichristus.interfaces.exercicio01;

public class ContaCorrente implements OperacoesBancarias, OperacoesPessoais {
    protected double montante;
    protected String nome;
    protected int id;

    public ContaCorrente(String nome) {
        this.montante = 0;
        this.nome = nome;
    }
    public ContaCorrente(double montante, String nome) {
        this.montante = montante;
        this.nome = nome;
    }

    @Override
    public double saldo() {
        return montante;
    }

    @Override
    public void depositar(double valor) {
        this.montante += valor;
    }

    @Override
    public void sacar(double valor) {
        if (montante >= (valor + 0.05*valor)) {
            montante = montante - valor - 0.05*valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }
}
