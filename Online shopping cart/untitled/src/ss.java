//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Scanner;
//
//class Productdisplay {
//    List<Product> list = new ArrayList<>();
//    Map<String, Product> productMap = new HashMap<>();
//
//    public void addproduct() {
//        int op = 1;
//        String x;
//        String name;
//        Scanner scanner = new Scanner(System.in);
//
//        while (op != 0) {
//            System.out.println("Welcome to our store");
//            System.out.println("Press 1 to continue or 0 to end purchase");
//            op = scanner.nextInt();
//
//            if (op == 0) {
//                System.out.println("Thanks for shopping");
//                break;
//            }
//
//            System.out.println("Enter the name of the product:");
//            name = scanner.next();
//
//            Product product = productMap.get(name);
//
//            if (product == null) {
//                System.out.println("Invalid product name.");
//                continue;
//            }
//
//            System.out.println("Write Add or remove");
//            x = scanner.next();
//
//            if (x.equalsIgnoreCase("Add"))
//                System.out.println("Successfully added" + list.add(product));
//            else if (x.equalsIgnoreCase("remove"))
//                System.out.println("Successfully removed" + list.remove(product));
//            else {
//                System.out.println("Invalid operation.");
//            }
//        }
//
//        for (Product element : list)
//            System.out.println("Your purchase:" + element);
//    }
//
//    public static void main(String[] args) {
//        Productdisplay productdisplay = new Productdisplay();
//        productdisplay.productMap.put("A", new Product("A", 1, 300));
//        productdisplay.productMap.put("B", new Product("B", 2, 400));
//        productdisplay.productMap.put("C", new Product("C", 3, 500));
//        productdisplay.productMap.put("D", new Product("D", 4, 600));
//        productdisplay.productMap.put("E", new Product("E", 5, 700));
//        productdisplay.productMap.put("F", new Product("F", 6, 800));
//        productdisplay.productMap.put("G", new Product("G", 7, 900));
//        productdisplay.productMap.put("H", new Product("H", 8, 1000));
//
//        for (Product element : productdisplay.productMap.values()) {
//            System.out.println(element);
//        }
//
//        productdisplay.addproduct();
//    }
//}
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Scanner;
//
//class ss extends Productdisplay {
//    List<Product> list = new ArrayList<>();
//    Map<String, Product> productMap = new HashMap<>();
//
//    public void carting() {
//        int op = 1;
//        String x;
//        String name;
//        Scanner scanner = new Scanner(System.in);
//
//        while (op != 0) {
//            System.out.println("Welcome to our store");
//            System.out.println("Press 1 to continue or 0 to end purchase");
//            op = scanner.nextInt();
//
//            if (op == 0) {
//                System.out.println("Thanks for shopping");
//                break;
//            }
//            System.out.println("Enter the name of the product or id");
//            name = scanner.next();
//            Product product = productMap.get(name);
//            if (product == null) {
//                System.out.println("Invalid product name");
//                continue;
//            }
//            System.out.println("Write Add or remove");
//            x = scanner.next();
//            if (x.equalsIgnoreCase("Add"))
//                System.out.println("Successfully added " + list.add(product));
//            else if (x.equalsIgnoreCase("remove"))
//                System.out.println("Successfully removed " + list.remove(product));
//            else {
//                System.out.println("Invalid operation.");
//            }
//        }
//
//        try {
//            File file = new File("slip.txt");
//            if (file.createNewFile()) {
//                System.out.println("File created: " + file.getName());
//            } else {
//                System.out.println("File already exists.");
//            }
//
//            // Writing the purchase details to the file
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true)); // 'true' for appending to the file
//            for (Product element : list) {
//                bufferedWriter.write(element.toString());
//                bufferedWriter.newLine();
//            }
//            bufferedWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//}
