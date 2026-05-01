package model;

public class Order {
    private String id;
    private double price;
    private int quantity;
    private String type;

    public Order(String id, double price, int quantity, String type) {
        this.id = id;
        this.price = price;
        this.quantity = quantity;
        this.type = type;
    }

    public String getId() { return id; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public String getType() { return type; }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
