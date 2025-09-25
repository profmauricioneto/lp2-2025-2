package edu.unichristus.review.provanp1.questao05;

import java.util.Date;

public class Pedido {
    public int quantidade;
    public double valor;
    public Date dataPedido;
    public Cliente cliente;

    public Pedido(int quantidade, double valor, Cliente cliente) {
        this.quantidade = quantidade;
        this.valor = valor;
        dataPedido = new Date();
        this.cliente = cliente;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double valorTotal() {
        return quantidade * valor;
    }
 }
