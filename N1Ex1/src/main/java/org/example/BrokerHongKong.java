package org.example;

public class BrokerHongKong extends Observer{

    public BrokerHongKong(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("Broker Hong Kong: " + subject.getValue());
    }
}
