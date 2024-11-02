public class Main {
    public static void main(String[] args) throws PaymentGatewayFailureException {
        Product product = new Product("Laptop", 1000, 10);
        Product product2 = new Product("Mouse", 20, 50);

        // cart array
        CartItem[] cart = new CartItem[2];

        // add products to cart
        cart[0] = new CartItem(product, 5);

        // process payment
        Payment payment = new Payment(-10, "Credit Card");

        // process payment without error handling
//        payment.processPayment();

        // process payment with error handling
        try {
            payment.processPayment();
            System.out.println("Payment successful");
        } catch (PaymentGatewayFailureException e) {
            System.out.println("Payment failed: " + e.getMessage());
        }
    }
}