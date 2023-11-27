import java.io.*;
import java.util.*;
class Userinteraction extends Productdisplay {
    List<Product> list = new ArrayList<>();
    Map<String, Product> productMap = new HashMap<>();
    File file = new File("slip.txt");
    public void carting() {
        int op = 1;
        String x;
        String name;
        Scanner scanner = new Scanner(System.in);
        while (op != 0) {
            System.out.println("Welcome to our store");
            System.out.println("Press 1 to continue or 0 to end purchase");
            op = scanner.nextInt();
            if (op == 0) {
                System.out.println("Thanks for shopping");
                break;
            }
            System.out.println("Enter the name of the product");

            name = scanner.next();

            Product product = productMap.get(name);
            if (product == null) {
                System.out.println("Invalid product name");
                continue;
            }
            System.out.println("Write Add or remove");
            x = scanner.next();
            if (x.equalsIgnoreCase("Add")) {

                if (list.add(product)) {
                    System.out.println("Successfully added");
                    System.out.println(product);
                }
            } else if (x.equalsIgnoreCase("remove")) {

                if (list.remove(product)) {
                    System.out.println("Successfully removed");
                    System.out.println(product);
                }
            } else {
                System.out.println("Invalid operation.");
            }
        }}
    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Product product : list) {
            totalPrice += product.getPrice();
            try {
                BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("slip.txt",true));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return totalPrice;
    }

    public void setProduct() {
        try{
            file.delete();
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
            // Writing the purchase details to the file
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true)); // 'true' for appending to the file
            for (Product element : list) {
                bufferedWriter.write(element.toString());
                bufferedWriter.newLine();
                System.out.println(element);
            }

            bufferedWriter.close();
        } catch (
                IOException e) {
            System.out.println("IOS exception");
        }
    }


}

