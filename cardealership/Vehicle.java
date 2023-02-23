package com.mycompany.cardealership;

public class Vehicle {
    private String Make;
    private String Model;
    private int Price;

    //A list of setters and getters to give values to and use the (private) objects above:

    public String getMake() {
        return Make;
    }

    public String getModel() {
        return Model;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public void setMake(String Make) {
        this.Make = Make;
    }
}
