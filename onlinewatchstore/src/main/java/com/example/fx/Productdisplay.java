package com.example.fx;
import java.io.File;
import java.io.IOException;
class Productdisplay {
    public static void main(String[] args) throws IOException {
        Userinteraction userinteraction= new Userinteraction();
        Checkout checkout=new Checkout(",","","");
        userinteraction.productMap.put(1, new Product("Luxury Watch 1", 1, 1000));
        userinteraction.productMap.put(2, new Product("Sports Watch 1", 2, 800));
        userinteraction.productMap.put(3, new Product("Casual Watch 1", 3, 500));
        userinteraction.productMap.put(4, new Product("Digital Watch 1", 4, 600));
        userinteraction.productMap.put(5, new Product("Smartwatch 1", 5, 700));
        userinteraction.productMap.put(6, new Product("Classic Watch 1", 6, 800));
        userinteraction.productMap.put(7, new Product("Fashion Watch 1", 7, 900));
        userinteraction.productMap.put(8, new Product("Dive Watch 1", 8, 1000));
        userinteraction.productMap.put(9, new Product("Luxury Watch 2", 9, 1200));
        userinteraction.productMap.put(10, new Product("Sports Watch 2", 10, 900));
        userinteraction.productMap.put(11, new Product("Casual Watch 2", 11, 700));
        userinteraction.productMap.put(12, new Product("Digital Watch 2", 12, 800));
        userinteraction.productMap.put(13, new Product("Smartwatch 2", 13, 1000));
        userinteraction.productMap.put(14, new Product("Classic Watch 2", 14, 1100));
        userinteraction.productMap.put(15, new Product("Fashion Watch 2", 15, 1200));
        userinteraction.productMap.put(16, new Product("Dive Watch 2", 16, 1300));
        userinteraction.productMap.put(17, new Product("Luxury Watch 3", 17, 1400));
        userinteraction.productMap.put(18, new Product("Sports Watch 3", 18, 1500));
        userinteraction.productMap.put(19, new Product("Casual Watch 3", 19, 1600));
        userinteraction.productMap.put(20, new Product("Digital Watch 3", 20, 1700));
        Product product;
        for (Product element : userinteraction.productMap.values()) {
            System.out.println(element);
        }
        Login login=new Login();
        userinteraction.carting();
        userinteraction.totalbill();
        checkout.order();
        double x=userinteraction.calculateTotalPrice();
        System.out.println("Total Bill="+x);
    }
}