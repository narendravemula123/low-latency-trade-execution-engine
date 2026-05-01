public class MatchingEngine {

    private final OrderBook orderBook;

    public MatchingEngine(OrderBook orderBook) {
        this.orderBook = orderBook;
    }

    public void match() {
        while (!orderBook.getBuyOrders().isEmpty() &&
               !orderBook.getSellOrders().isEmpty()) {

            Order buy = orderBook.getBuyOrders().peek();
            Order sell = orderBook.getSellOrders().peek();

            if (buy.getPrice() >= sell.getPrice()) {
                int tradedQty = Math.min(buy.getQuantity(), sell.getQuantity());

                executeTrade(buy, sell, tradedQty);

                if (buy.isFilled()) {
                    orderBook.getBuyOrders().poll();
                }

                if (sell.isFilled()) {
                    orderBook.getSellOrders().poll();
                }

            } else {
                break;
            }
        }
    }

    private void executeTrade(Order buy, Order sell, int quantity) {
        buy.reduceQuantity(quantity);
        sell.reduceQuantity(quantity);

        System.out.println(
            "Executed Trade -> Qty: " + quantity +
            " Price: " + sell.getPrice() +
            " | BuyID: " + buy.getId() +
            " SellID: " + sell.getId()
        );
    }
}
