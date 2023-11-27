//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class check {
//
//    List<Product> list = new ArrayList<>();
//    Product[] product;
//
//    public void addproduct(String x, int id) {
//
//        if (x.equalsIgnoreCase("Add"))
//
//            System.out.println("Successfully added" + list.add(product[id]));
//        if (x.equalsIgnoreCase("remove"))
//            System.out.println("Successfully removed" + list.remove(product[id]));
//    }
//                    else
//
//    {
//        System.out.println("Invalid index");
//
//}
//        for (Product element : list)
//            System.out.println("Your purchase:" + element);
//    }
//
//}
//        public static void main(String[] args) {
//            Productdisplay productdisplay = new Productdisplay();
//            productdisplay.product = new Product[8];
//            productdisplay.product[0] = new Product("A", 1, 300);
//            productdisplay.product[1] = new Product("B", 2, 400);
//            productdisplay.product[2] = new Product("C", 3, 500);
//            productdisplay.product[3] = new Product("D", 4, 600);
//            productdisplay.product[4] = new Product("E", 5, 700);
//            productdisplay.product[5] = new Product("F", 6, 800);
//            productdisplay.product[6] = new Product("G", 7, 900);
//            productdisplay.product[7] = new Product("H", 8, 1000);
//
//            for (Product element : productdisplay.product) {
//                System.out.println(element);
//            }
//
//            productdisplay.addproduct();
//
//                int op = 1;
//                String x;
//                int i;
//                Scanner scanner = new Scanner(System.in);
//            while (op != 0) {
//
//                System.out.println("Welcome to our store");
//                System.out.println("Press 1 to continue or 0 to end purchase");
//                op = scanner.nextInt();
//
//                if (op == 0) {
//                    System.out.println("Thanks for shopping");
//                    break;
//                }
//
//
//                System.out.println("Enter the id");
//
//                i = scanner.nextInt();
//
//                if (product == null) {
//                    System.out.println("Product array is not initialized.");
//                    return;
//                }
//        if (i >= 0 && i < product.length) {
//        System.out.println("Write Add or remove");
//
//
//        x = scanner.next();
//            }
//        }
//
//    }
//
//}
