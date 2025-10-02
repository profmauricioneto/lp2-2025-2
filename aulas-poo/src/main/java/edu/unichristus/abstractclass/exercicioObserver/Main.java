package edu.unichristus.abstractclass.exercicioObserver;

public class Main {
    public static void main(String[] args) {
        Subject sujeito = new Subject();

        ObserverSenderEmail observerEmails = new ObserverSenderEmail(sujeito);
        observerEmails.addEmail("fulano@email.com");
        observerEmails.addEmail("cicrano@email.com");

        ObserverSenderSMS observerSMS = new ObserverSenderSMS(sujeito);
        observerSMS.addNumber("85 1122334455");
        observerSMS.addNumber("85 5544332211");

        for(int i = 0; i < 5; i++) {
            if (sujeito.isEven(i)) {
                sujeito.notifyAllAttaches();
            }
        }

    }
}
