package edu.unichristus.abstractclass.exercicioObserver;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    public List<Observer> observers;
    public Subject() {
        this.observers = new ArrayList<>();
    }
    public boolean isEven(int value) {
        return (value % 2 == 0);
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyAllAttaches() {
        System.out.println("Um evento ocorreu....avisando a todos.");
        for (Observer ob: observers) {
            ob.update();
        }
    }
}
