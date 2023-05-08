package org.example;

public class BrokerNewYork extends Observer{

    public BrokerNewYork(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("Broker New York: " + subject.getValue());
    }
}

