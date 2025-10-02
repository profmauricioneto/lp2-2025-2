package edu.unichristus.abstractclass.exercicioObserver;

import java.util.ArrayList;
import java.util.List;

public class ObserverSenderEmail extends Observer {
    private List<String> listEmails;

    public ObserverSenderEmail(Subject subject) {
        this.listEmails = new ArrayList<>();
        subject.attach(this);
    }

    public void addEmail(String email) {
        this.listEmails.add(email);
    }

    public void showEmails() {
        for (String email: listEmails){
            System.out.println(email);
        }
    }

    @Override
    public void update() {
        System.out.println("Enviando emails para: ");
        showEmails();
    }
}
