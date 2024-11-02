import java.util.ArrayList;
import java.util.List;
class ShoppingCart {
    private List<CartItem> cartItems = new ArrayList<>();

    public void addProduct(Product product, int quantity) throws ProductOutOfStockException,InvalidInputException {
        if (quantity <= 0) {
            throw new InvalidInputException("Quantity must be greater than 0.");
        }
        if (product.stock < quantity) {
            throw new ProductOutOfStockException("Product " + product.name + " is out of stock.");
        }
        cartItems.add(new CartItem(product, quantity));
        System.out.println(quantity + " units of " + product.name + " added to the cart.");
    }

    public double calculateTotal() {
        double total = 0;
        for (CartItem item : cartItems) {
            total += item.product.price * item.quantity;
        }
        return total;
    }
}