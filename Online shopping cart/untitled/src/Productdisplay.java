import java.io.File;
import java.io.IOException;
class Productdisplay {
    public static void main(String[] args) throws IOException {
        Userinteraction userinteraction= new Userinteraction();
        Checkout checkout=new Checkout(",","","");
        userinteraction.productMap.put("", new Product("A", 1, 300));
        userinteraction.productMap.put("Ba", new Product("B", 2, 400));
        userinteraction.productMap.put("C", new Product("C", 3, 500));
        userinteraction.productMap.put("D", new Product("D", 4, 600));
        userinteraction.productMap.put("E", new Product("E", 5, 700));
        userinteraction.productMap.put("F", new Product("F", 6, 800));
        userinteraction.productMap.put("G", new Product("G", 7, 900));
        userinteraction.productMap.put("H", new Product("H", 8, 1000));
        Product product;
        for (Product element : userinteraction.productMap.values()) {
            System.out.println(element);
        }
        userinteraction.carting();
        userinteraction.setProduct();
        checkout.order();
        double x=userinteraction.calculateTotalPrice();
        System.out.println("Total Bill="+x);
    }
}