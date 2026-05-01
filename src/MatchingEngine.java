import java.util.PriorityQueue;

public class MatchingEngine {

    private PriorityQueue<Order> buyOrders;
    private PriorityQueue<Order> sellOrders;

    public MatchingEngine(OrderBook orderBook) {
        this.buyOrders = orderBook.getBuyOrders();
        this.sellOrders = orderBook.getSellOrders();
    }

    public void matchOrders() {
        while (!buyOrders.isEmpty() && !sellOrders.isEmpty()) {

            Order buy = buyOrders.peek();
            Order sell = sellOrders.peek();

            if (buy.getPrice() >= sell.getPrice()) {

                int quantity = Math.min(buy.getQuantity(), sell.getQuantity());

                System.out.println("Trade Executed: " + quantity +
                        " units at price " + sell.getPrice());

                buy.setQuantity(buy.getQuantity() - quantity);
                sell.setQuantity(sell.getQuantity() - quantity);

                if (buy.getQuantity() == 0) buyOrders.poll();
                if (sell.getQuantity() == 0) sellOrders.poll();

            } else {
                break;
            }
        }
    }
}
