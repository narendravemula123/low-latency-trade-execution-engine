import java.util.PriorityQueue;

public class OrderBook {

    private PriorityQueue<Order> buyOrders;
    private PriorityQueue<Order> sellOrders;

    public OrderBook() {
        buyOrders = new PriorityQueue<>((a, b) -> Double.compare(b.getPrice(), a.getPrice()));
        sellOrders = new PriorityQueue<>((a, b) -> Double.compare(a.getPrice(), b.getPrice()));
    }

    public void addOrder(Order order) {
        if (order.getType().equalsIgnoreCase("BUY")) {
            buyOrders.add(order);
        } else {
            sellOrders.add(order);
        }
    }

    public PriorityQueue<Order> getBuyOrders() {
        return buyOrders;
    }

    public PriorityQueue<Order> getSellOrders() {
        return sellOrders;
    }
}
