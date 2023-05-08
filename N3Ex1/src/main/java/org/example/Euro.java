package org.example;

import java.sql.SQLOutput;

public class Euro implements Money {
    @Override
    public void value (double amount) {
        double value = 0.91; // value of the euro against the dollar.
        System.out.println("USD$" + amount + " = €" + value*amount);
    }
}
