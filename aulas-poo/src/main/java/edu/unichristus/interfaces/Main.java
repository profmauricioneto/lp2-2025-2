package edu.unichristus.interfaces;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new CalculadoraBasica();
        System.out.println(calc.somar(1,2,3,4,5));

        Cientifica calcCientifica = new CalculadoraCientifica();
    }
}
