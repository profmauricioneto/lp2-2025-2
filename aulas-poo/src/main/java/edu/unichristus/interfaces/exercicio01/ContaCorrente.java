package edu.unichristus.interfaces.exercicio01;

public class ContaCorrente implements OperacoesBancarias {
    protected double montante;

    public ContaCorrente() {
        this.montante = 0;
    }
    public ContaCorrente(double montante) {
        this.montante = montante;
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
}
