package edu.unichristus.review.provanp1.questao05;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public String cpf;
    public String nome;
    public String telefone;
    public List<Pedido> pedidos;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        pedidos = new ArrayList<Pedido>();
    }
    public String getNome() {
        return nome;
    }
    public String getTelefone() {
        return telefone;
    }
 }
