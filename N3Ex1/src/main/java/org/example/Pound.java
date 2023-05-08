package org.example;

public class Pound implements Money {
    @Override
    public void value (double amount ) {
        double value = 0.80; // value of the pound against the dollar.
        System.out.println("USD$" + amount + " = £" + value*amount);
    }
}
