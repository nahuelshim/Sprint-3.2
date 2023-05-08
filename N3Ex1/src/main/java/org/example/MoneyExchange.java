package org.example;

public class MoneyExchange {
    private Money money;

    public MoneyExchange(Money money) {
        this.money = money;
    }

    public Money getMoney() {
        return money;
    }

    public void setMoney(Money money) {
        this.money = money;
    }

    public void exchange (double amount) {
        System.out.println("Changing...");
        try {
            Thread.sleep(1350);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        money.value(amount);
    }
}
