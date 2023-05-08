package org.example;

public class Sneaker {

    private String brand;
    private String model;
    private float price;

    public Sneaker (String brand, String model, float price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void sale (Payment payment) {
        payment.pay();
        try{
            Thread.sleep(3500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Successful payment");
    }

    @Override
    public String toString() {
        return  "model: "   + model + '\n' +
                "brand: "   + brand + '\n' +
                "price: € " + price ;

    }
}
