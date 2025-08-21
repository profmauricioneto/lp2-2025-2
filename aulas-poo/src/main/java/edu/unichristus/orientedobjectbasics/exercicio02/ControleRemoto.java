package edu.unichristus.orientedobjectbasics.exercicio02;

public class ControleRemoto {
    public int canal;
    public int volume;

    public ControleRemoto(int canal, int volume) {
        this.canal = canal;
        this.volume = volume;
    }

    public int aumentarVolume() {
        if (volume < 100) {
            this.volume++;
        }
        return volume;
    }

    public int diminuirVolume() {
        if (volume > 0) {
            this.volume--;
        }
        return volume;
    }

    public int aumentarCanal() {
        if (canal < 100) {
            this.canal++;
        }
        return canal;
    }

    public int diminuirCanal() {
        if (canal > 0) {
            this.canal--;
        }
        return canal;
    }

    public int mudarCanal(int canal) {
        this.canal = canal;
        return this.canal;
    }

    public void mostrarInformacoes() {
        System.out.println("Canal: " + this.canal);
        System.out.println("Volume: " + this.volume);
    }
}
