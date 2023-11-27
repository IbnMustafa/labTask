import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Checkout {
     String name;
     String Address;
    String paymentmethod;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }
    public String getPaymentmethod() {
        return paymentmethod;
    }
    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
    }
    public Checkout(String name, String address, String paymentmethod) {
        this.name = name;
        Address = address;
        this.paymentmethod = paymentmethod;
    }
    public String toString(){
        return String.format("name:%s \nAdddress:%s",name,Address);
    }
    public void order() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        name = sc.nextLine();
        System.out.println("Enter your address");
        Address = sc.nextLine();

        System.out.println("Your name:" + name);
        System.out.println("Address:" + Address);
        File file=new File("slip.txt");
        if(file.exists()){
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(file,true));
        bufferedWriter.write(toString());
        bufferedWriter.newLine();
        bufferedWriter.close();
    }}



}
