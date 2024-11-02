public class PaymentGatewayFailureException extends Exception {

    public PaymentGatewayFailureException() {
        super("Payment gateway failure");
    }

    public PaymentGatewayFailureException(String message) {
        super(message);
    }
}
