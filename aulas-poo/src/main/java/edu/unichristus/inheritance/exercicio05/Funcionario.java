package edu.unichristus.inheritance.exercicio05;

import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Pessoa {
    protected double salario;
    private List<Venda> vendas;

    public Funcionario(int codigo, String nome) {
        super(codigo);
        this.setNome(nome);
        this.salario = 0;
        this.vendas = new ArrayList<>();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void addVenda(Venda venda) {
        this.vendas.add(venda);
    }

    public void listarVendas() {
        for(Venda venda: vendas) {
            venda.mostrarInformacaoVenda();
        }
    }
}
