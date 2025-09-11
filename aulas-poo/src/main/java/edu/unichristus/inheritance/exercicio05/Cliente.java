package edu.unichristus.inheritance.exercicio05;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
    private String email;
    private List<Venda> compras;

    public Cliente(int codigo, String nome) {
        super(codigo);
        this.setNome(nome);
        this.email = "";
        this.compras = new ArrayList<>();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addCompra(Venda compra) {
        this.compras.add(compra);
    }

    public void listarCompras() {
        for(Venda compra: compras) {
            compra.mostrarInformacaoVenda();
        }
    }
}
