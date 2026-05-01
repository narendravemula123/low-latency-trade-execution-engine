enum OrderType {
    BUY, SELL
}

public class Order {
    private final int id;
    private final double price;
    private int quantity;
    private final OrderType type;

    public Order(int id, double price, int quantity, OrderType type) {
        this.id = id;
        this.price = price;
        this.quantity = quantity;
        this.type = type;
    }

    public int getId() { return id; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public OrderType getType() { return type; }

    public void reduceQuantity(int amount) {
        this.quantity -= amount;
    }

    public boolean isFilled() {
        return quantity == 0;
    }
}
