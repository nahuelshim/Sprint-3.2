package org.example;

public class PayPal implements Payment {

    @Override
    public void pay() {
        System.out.println("Processing payment by PayPal...");
    }
}

