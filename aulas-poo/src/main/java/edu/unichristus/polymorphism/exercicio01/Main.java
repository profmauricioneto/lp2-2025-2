package edu.unichristus.polymorphism.exercicio01;

public class Main {
    public static void main(String[] args) {
//        ImovelNovo beiramar = new ImovelNovo(90000, 0.05);
//        System.out.println("Imovel Novo sem Corretor: " + beiramar.calculoImovelNovo());
//
//        beiramar = new ImovelNovoCorretor(90000, 0.05, 0.03);
//        System.out.println("Imovel Novo com Corretor: " + beiramar.calculoImovelNovo());
        Imovel beiramar = new ImovelNovoCorretor(90000, 0.05, 0.03);

        System.out.println("Imovel novo com corretor: " + beiramar.calcularImovel());

        beiramar = new ImovelVelho(90000, 0.05);
        System.out.println("Imovel velho: " + beiramar.calcularImovel());
    }
}
