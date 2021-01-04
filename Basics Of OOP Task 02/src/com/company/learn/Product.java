package com.company.learn;

public class Product {

    private String name;
    private int price;

    public Product (String name, int price){
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return getName()+"; цена: "+ getPrice() + " руб.";
    }
}
