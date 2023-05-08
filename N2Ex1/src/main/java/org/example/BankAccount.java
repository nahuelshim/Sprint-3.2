package org.example;

public class BankAccount implements Payment{

    @Override
    public void pay() {
        System.out.println("Processing payment by bank account...");
    }
}
