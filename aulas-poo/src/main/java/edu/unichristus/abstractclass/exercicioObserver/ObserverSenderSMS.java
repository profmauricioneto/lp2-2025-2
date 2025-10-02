package edu.unichristus.abstractclass.exercicioObserver;

import java.util.ArrayList;
import java.util.List;

public class ObserverSenderSMS extends Observer {
    private List<String> listNumber;

    public ObserverSenderSMS(Subject subject) {
        this.listNumber = new ArrayList<>();
        subject.attach(this);
    }

    public void addNumber(String number) {
        this.listNumber.add(number);
    }

    public void showNumbers() {
        for(String number : listNumber) {
            System.out.println(number);
        }
    }

    @Override
    public void update() {
        System.out.println("Enviando SMS para numberos: ");
        showNumbers();
    }
}
