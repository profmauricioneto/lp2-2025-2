package edu.unichristus.encapsulamento.exercicio01;

public class Main {
    public static void main(String[] args) {
        Conta contaMauricio = new Conta();
        System.out.println("Valor atual do Saldo: " + contaMauricio.consultar());
        contaMauricio.depositar(500);
        System.out.println("Valor atual do Saldo: " + contaMauricio.consultar());
        contaMauricio.sacar(1500);
        System.out.println("Valor atual do Saldo: " + contaMauricio.consultar());
        contaMauricio.sacar(1);
    }
}
