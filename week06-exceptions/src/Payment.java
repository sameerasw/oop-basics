public class Payment {
    private double amount;
    private String paymentMethod;
    private String paymentStatus;

    public Payment(double amount, String paymentMethod) {
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = "Pending";
    }

    public double getAmount() {
        return amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void processPayment() throws PaymentGatewayFailureException {
        // Simulate payment gateway failure
        if (this.amount <= 0) {
            throw new PaymentGatewayFailureException("Invalid amount");
        }
    }

}
