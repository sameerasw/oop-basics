class Payment {
    public void processPayment(double amount) throws PaymentGatewayException {
        if (Math.random() < 0.2)
        { // Simulate random payment failures
            throw new PaymentGatewayException("Payment gateway error. Please try again.");
        }
        System.out.println("Payment of $" + amount + " processed successfully.");
    }
}