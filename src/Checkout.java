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

}
