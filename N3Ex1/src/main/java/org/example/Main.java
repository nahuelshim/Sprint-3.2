package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MoneyExchange moneyExchange1 = new MoneyExchange(new Euro());
        MoneyExchange moneyExchange2 = new MoneyExchange(new Pound());

        Scanner sc = new Scanner(System.in);
        System.out.println("How many dollars do you want?");
        double amount = sc.nextDouble();

        moneyExchange1.exchange(amount);
        moneyExchange2.exchange(amount);

    }
}