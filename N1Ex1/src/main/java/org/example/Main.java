package org.example;

public class Main {
    public static void main(String[] args) {

        Subject subject = new Subject();
        
        new BrokerNewYork(subject);
        new BrokerHongKong(subject);

        System.out.println("Apple shares");
        subject.setValue("down");

    }
}