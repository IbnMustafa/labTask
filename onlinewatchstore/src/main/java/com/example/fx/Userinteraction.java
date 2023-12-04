package com.example.fx;

import java.io.*;
import java.util.*;
class Userinteraction extends Productdisplay {
    List<Product> list = new ArrayList<>();
    Map<Integer, Product> productMap = new HashMap<>();
    File file = new File("slip.txt");
    int pquantity;
   Product product=productMap.get(0);
    public void carting() {
        int op = 1;
        String x;
        int id;
        Scanner scanner = new Scanner(System.in);
        while (op != 0) {
            System.out.println("Welcome to our store");
            System.out.println("Press 1 to continue or 0 to end purchase");
            op = scanner.nextInt();
            if (op == 0) {
                System.out.println("Thanks for shopping");
                System.out.println("Your Purchase:");
                break;
            }
            System.out.println("Enter the id of the product");
            id = scanner.nextInt();
            Product product = productMap.get(id);
            if (product == null) {
                System.out.println("Invalid product name");
                continue;
            }
            System.out.println("Write Add or remove");
            x = scanner.next();
            if(x.equalsIgnoreCase("Add")) {
                if (list.add(product)) {
                    System.out.println("Added to your cart");
                    System.out.println(product);
                }
            } else if (x.equalsIgnoreCase("remove")) {
                if (list.remove(product)) {
                    System.out.println("removed from your cart");
                    System.out.println(product);

                }
                else {
                    System.out.println("Not removed");
                }
            } else {
                System.out.println("Invalid operation.");
            }
        }
    }
    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Product product : list) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    public void totalbill() {
        try {
            file.delete();
            file.createNewFile();
            // Writing the purchase details to the file
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
            for (Product element : list) {
                bufferedWriter.write(element.toString());
                bufferedWriter.newLine();
                System.out.println(element);
            }
            bufferedWriter.write(String.format("Total Bill: %.2f", calculateTotalPrice()));
            bufferedWriter.newLine();

            bufferedWriter.close();
        } catch (
                IOException e) {
            System.out.println("IOS exception");
        }
    }

}

