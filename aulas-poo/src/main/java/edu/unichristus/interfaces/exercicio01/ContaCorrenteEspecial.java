package edu.unichristus.interfaces.exercicio01;

public class ContaCorrenteEspecial extends ContaCorrente {
    public ContaCorrenteEspecial() {
        super();
    }
    public ContaCorrenteEspecial(double montante) {
        super(montante);
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
