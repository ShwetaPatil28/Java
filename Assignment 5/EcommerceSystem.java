import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;
    private String productId;

    public Product(String name, double price, String productId) {
        this.name = name;
        this.price = price;
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getProductId() {
        return productId;
    }

    public void displayProductDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
    }
}

class Customer {
    private String name;
    private String customerId;

    public Customer(String name, String customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void displayCustomerInfo() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + name);
    }
}

class Order {
    private Customer customer;
    private List<Product> products;

    public Order(Customer customer) {
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    public void displayOrder() {
        System.out.println("=== Order Summary ===");
        customer.displayCustomerInfo();
        System.out.println("Ordered Products:");
        for (Product p : products) {
            p.displayProductDetails();
            System.out.println("----------------------");
        }
        System.out.printf("Total Cost: $%.2f\n", calculateTotal());
    }
}

public class EcommerceSystem {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1200.00, "P001");
        Product product2 = new Product("Smartphone", 800.00, "P002");

        
        Customer customer = new Customer("Alice Smith", "C100");

                Order order = new Order(customer);
        order.addProduct(product1);
        order.addProduct(product2);

                order.displayOrder();
    }
}
