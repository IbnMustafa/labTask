import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 class Productdisplay extends Product {
     public Productdisplay(String name, int id, double price) {
         super(name, id, price);
     }
     int index=0;
     public static void displaproducts() {
         Product[] product = new Product[8];
         product[0] = new Product("A", 1, 300);
         product[1] = new Product("B", 2, 400);
         product[2] = new Product("C", 3, 500);
         product[3] = new Product("D", 4, 600);
         product[4] = new Product("E", 5, 700);
         product[5] = new Product("F", 6, 800);
         product[6] = new Product("G", 7, 900);
         product[7] = new Product("H", 8, 1000);
         for (Product element : product) {
             System.out.println(element);
         }
         ArrayList<Product> list = new ArrayList<>();
         Scanner scanner = new Scanner(System.in);
         int op = 1;
         String x;
         int i;
         while (op != 0) {
             System.out.println("welcome to our store");
             System.out.println("Press 1 o continue or 0 to end purchase");
             op = scanner.nextInt();
             if (op == 0) {
                 System.out.println("Thanks for shopping");
                 break;
             }
             System.out.println("Enter the index");
             i= scanner.nextInt();
             System.out.println("Write Add or remove");
             x = scanner.next();
             if (x.equals("Add"))
                 System.out.println("Succefullly added" + list.add(product[i]));
             if (x.equals("remove"))
                 System.out.println("Succeffuly removed" + list.remove(product[i]));
         }
         for (Product element : list)
             System.out.println("Your purchase:" + element);
     }

 public static void main(String[] arg) {
         Loginpage loginpage=new Loginpage();
     Productdisplay.displaproducts();
 }
    }
