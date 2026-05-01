import java.util.PriorityQueue;

public class OrderBook {

    private final PriorityQueue<Order> buyOrders;
    private final PriorityQueue<Order> sellOrders;

    public OrderBook() {
        buyOrders = new PriorityQueue<>(
                (a, b) -> Double.compare(b.getPrice(), a.getPrice())
        );

        sellOrders = new PriorityQueue<>(
                (a, b) -> Double.compare(a.getPrice(), b.getPrice())
        );
    }

    public void addOrder(Order order) {
        if (order.getType() == OrderType.BUY) {
            buyOrders.offer(order);
        } else {
            sellOrders.offer(order);
        }
    }

    public PriorityQueue<Order> getBuyOrders() {
        return buyOrders;
    }

    public PriorityQueue<Order> getSellOrders() {
        return sellOrders;
    }
}
