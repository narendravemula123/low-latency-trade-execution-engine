public class Main {

    public static void main(String[] args) {

        OrderBook orderBook = new OrderBook();
        MatchingEngine engine = new MatchingEngine(orderBook);

        orderBook.addOrder(new Order(1, 100, 10, OrderType.BUY));
        orderBook.addOrder(new Order(2, 95, 5, OrderType.SELL));
        orderBook.addOrder(new Order(3, 98, 7, OrderType.SELL));
        orderBook.addOrder(new Order(4, 102, 8, OrderType.BUY));

        engine.match();
    }
}
