package edu.unichristus.interfaces;

public class CalculadoraCientifica implements  Calculadora, Cientifica {
    @Override
    public double somar(double ...args) {
        double somatorio = 0;
        for(double value: args) {
            somatorio += value;
        }
        return somatorio;
    }

    @Override
    public double subtrair(double ...args) {
        double somatorio = 0;
        for(double value: args) {
            somatorio -= value;
        }
        return somatorio;
    }

    @Override
    public double multiplicar(double ...args) {
        double produtorio = 1;
        for(double value: args) {
            produtorio *= value;
        }
        return produtorio;
    }

    @Override
    public double dividir(double ...args) {
        double produtorio = 0;
        try {
            for(double value: args) {
                produtorio /= value;
            }
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
        return produtorio;
    }

    @Override
    public double sqrt(double value) {
        return Math.sqrt(value);
    }

    @Override
    public double exp(double base, double exponente) {
        return Math.pow(base, exponente);
    }
}
