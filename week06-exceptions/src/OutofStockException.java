public class OutofStockException extends Exception {

    public OutofStockException() {
        super("Out of stock");
    }

    public OutofStockException(String message) {
        super(message);
    }
}
