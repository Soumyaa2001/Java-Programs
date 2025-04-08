class Product {
    String productId;
    String productName;
    double price;
    int quantity;

    public Product(String productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        Product p1 = new Product("P001", "Laptop", 800.00, 2);
        Product p2 = new Product("P002", "Smartphone", 500.00, 3);
        Product p3 = new Product("P003", "Headphones", 100.00, 5);

        double totalBill = p1.getTotalPrice() + p2.getTotalPrice() + p3.getTotalPrice();
        System.out.println("Total Bill Amount: " + totalBill);
    }
}