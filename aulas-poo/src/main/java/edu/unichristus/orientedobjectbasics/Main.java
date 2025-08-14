package edu.unichristus.orientedobjectbasics;

public class Main {
    public static void main(String[] args) {
        Carro carro_mauricio = new Carro();
        carro_mauricio.quantidadePneus = 4;
        carro_mauricio.quantidadePortas = 4;
        carro_mauricio.cor = "Branco";

        System.out.println("Carro Mauricio");
        carro_mauricio.infoCarro();
        carro_mauricio.acelerar();
        carro_mauricio.frear();

        Carro carro_maria = new Carro();
        carro_maria.quantidadePneus = 4;
        carro_maria.quantidadePortas = 2;
        carro_maria.cor = "Azul";

        System.out.println("Carro Maria");
        carro_maria.infoCarro();
        carro_maria.acelerar();
        carro_maria.frear();
    }


}
