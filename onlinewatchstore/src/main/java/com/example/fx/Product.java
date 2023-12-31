package com.example.fx;
public class Product {
    private String name;
    int id;
    private double price;
    public Product(String name, int id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("Name: %s id: %d Price: %f ", name, id, price);
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
