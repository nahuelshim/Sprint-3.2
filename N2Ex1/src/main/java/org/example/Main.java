package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Sneaker footLocker = new Sneaker("Adidas", "Forum", 110);

        Payment bankAccount = new BankAccount();
        Payment creditCard = new CreditCard();
        Payment payPal = new PayPal();

        Scanner sc = new Scanner(System.in);
        System.out.println("Total price is: €" + footLocker.getPrice() + " \nHow would you like to pay? \n1-Bank account\n2-Credit card\n3-Paypal");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                footLocker.sale(bankAccount);
                break;
            case 2:
                footLocker.sale(creditCard);
                break;
            case 3:
                footLocker.sale(payPal);
                break;

        }
    }
}