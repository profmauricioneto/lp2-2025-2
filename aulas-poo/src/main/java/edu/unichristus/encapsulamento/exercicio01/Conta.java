package edu.unichristus.encapsulamento.exercicio01;

public class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public Conta() {
        this.saldo = 0;
    }

    public void depositar(double valor) {
        this.saldo += valor; // saldo = saldo + valor;
    }

    public void sacar(double valor) {
        if (saldo < valor) {
            System.out.println("Saldo Insuficiente");
        } else {
            this.saldo -= valor;
        }
    }

    public double consultar() {
        return saldo;
    }
}
