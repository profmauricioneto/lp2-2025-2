package edu.unichristus;

import java.util.Scanner;

public class Janela {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double altura, largura, area, perimetro;
        System.out.print("Digite a altura da Janela: ");
        altura = input.nextDouble();
        System.out.print("Digite a largura da Janela: ");
        largura = input.nextDouble();

        Retangulo retangulo = new Retangulo(altura, largura);
        area = retangulo.calcularArea();
        perimetro = retangulo.calcularPerimetro();

        System.out.println("Valor da área da Janela: " + area);
        System.out.println("Valor do perímetro da Janela: " + perimetro);
    }
}
