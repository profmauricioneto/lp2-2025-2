package edu.unichristus.review.questao8;

import java.util.ArrayList;
import java.util.List;

public class Conta {
    private int id;
    public Cliente cliente;
    public List<Transacao> transacoes;

    public Conta(int id) {
        this.id = id;
        this.transacoes = new ArrayList<>();
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
