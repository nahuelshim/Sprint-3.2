package org.example;

public class CreditCard implements Payment {

    @Override
    public void pay() {
        System.out.println("Processing payment by credit card...");
    }
}

