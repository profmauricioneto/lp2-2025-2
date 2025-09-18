package edu.unichristus.review.questao8;

import java.util.Date;

public class Transacao {
    private double valor;
    private Date data;
    private String tipo;
    public Conta conta;

    public Transacao(double valor, String tipo, Conta conta) {
        this.valor = valor;
        this.tipo = tipo;
        this.conta = conta;
        data = new Date();
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
