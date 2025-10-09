package edu.unichristus.interfaces.exercicio01;

public class ContaCorrenteEspecial extends ContaCorrente {
    public ContaCorrenteEspecial(String nome) {
        super(nome);
    }
    public ContaCorrenteEspecial(double montante, String nome) {
        super(montante, nome);
    }

    @Override
    public void sacar(double valor) {
        if (montante >= (valor + 0.01*valor)) {
            montante = montante - valor - 0.01*valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
