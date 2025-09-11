package edu.unichristus.inheritance.exercicio05;

import java.util.Date;

public class Venda {
    private int codigo;
    public Date data;
    private Cliente cliente;
    private Funcionario funcionario;

    public Venda(int codigo, Cliente cliente, Funcionario funcionario) {
        this.codigo = codigo;
        this.data = new Date();
        this.cliente = cliente;
        this.funcionario = funcionario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void mostrarInformacaoVenda() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Data: " + data);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Funcionario: " + funcionario.getNome());
    }
}
