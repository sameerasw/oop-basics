import java.util.ArrayList;
import java.util.List;

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        try {
            // Product list (name, price, stock)
            Product laptop = new Product("Laptop", 1200.00, 10);
            Product phone = new Product("Phone", 800.00, 0); // Out of stock

            // Shopping cart operations
            ShoppingCart cart = new ShoppingCart();
            cart.addProduct(laptop, 2);  // Valid product addition
            cart.addProduct(phone, 1);   // This will throw ProductOutOfStockException

            // Calculate total amount
            double totalAmount = cart.calculateTotal();
            System.out.println("Total amount: $" + totalAmount);

            // Proceed to payment
            Payment payment = new Payment();
            payment.processPayment(totalAmount);

        } catch (ProductOutOfStockException | InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (PaymentGatewayException e) {
            System.out.println("Payment failed: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Unexpected error occurred: " + e.getMessage());

        } finally {
            System.out.println("Thank you for shopping with us!");
        }
    }
}