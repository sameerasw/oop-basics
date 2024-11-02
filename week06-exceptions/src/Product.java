public class Product {
    //You are developing an online shopping system that allows customers to add products to their cart, proceed to checkout, and make payments.
    //While implementing this system, you encounter several potential issues (like invalid inputs, out-of-stock products, or payment gateway failures)
    // that need proper exception handling to ensure a smooth customer experience.

    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void addProduct(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Invalid quantity");
        }
        this.quantity += quantity;
    }

    public void removeProduct(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Invalid quantity");
        }
        if (quantity > this.quantity) {
            throw new IllegalArgumentException("Not enough quantity in stock");
        }
        this.quantity -= quantity;
    }

    public void purchaseProduct(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Invalid quantity");
        }
        if (quantity > this.quantity) {
            throw new IllegalArgumentException("Not enough quantity in stock");
        }
        this.quantity -= quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Invalid price");
        }
        this.price = price;
    }
}
