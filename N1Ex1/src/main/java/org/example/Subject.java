package org.example;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers;
    private String value;

    public Subject() {
        observers = new ArrayList<Observer>();
    }

    public String getValue() {
        return value;
    }

    public void setValue (String value) {
        this.value = value;
        notifyAllObservers();
    }

    public void add(Observer stockAgency) {
        observers.add(stockAgency);
    }

    public void notifyAllObservers() {
        observers.forEach(x -> x.update());
    }


}
