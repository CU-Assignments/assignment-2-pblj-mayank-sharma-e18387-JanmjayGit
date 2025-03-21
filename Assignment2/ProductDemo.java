class Product {
    // Attributes
    int id;
    String name;
    double price;

    // Constructor
    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Method to display product details
    void displayProductDetails() {
        System.out.println("Product Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        // Example input
        Product product = new Product(101, "Laptop", 75000);

        // Display output
        product.displayProductDetails();
    }
}
