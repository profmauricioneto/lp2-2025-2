package edu.unichristus.orientedobjectbasics.exercicio02;

public class Televisao {

    public int canal;
    public int volume;
    ControleRemoto controle;

    public Televisao() {
        controle = new ControleRemoto(0, 0);
    }

    public void mostrarInformacoes() {
        controle.mostrarInformacoes();
    }

    public void mudarCanal(int canal) {
        this.canal = controle.mudarCanal(canal);
    }

    public static void main(String[] args) {
        Televisao tv = new Televisao();
    }
}
