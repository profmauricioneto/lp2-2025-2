package edu.unichristus;

import java.util.Scanner;

public class AreaJanelaEstruturada {
    public static void main(String[] args) {
        double altura, largura, area, perimetro;
        Scanner input = new Scanner(System.in);
        // entrada de dados
        System.out.print("Digite a altura da Janela: ");
        altura = input.nextDouble();
        System.out.print("Digite a largura da Janela: ");
        largura = input.nextDouble();

        // processamento
        area = (largura * altura);
        perimetro = 2*largura + 2*altura;

        //  saída de dados
        System.out.println("Valor da área da Janela: " + area);
        System.out.println("Valor do perímetro da Janela: " + perimetro);
    }
}
