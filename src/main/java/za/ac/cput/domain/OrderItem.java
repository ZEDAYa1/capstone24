package za.ac.cput.domain;

/*
 *Order Item: java
 *Order Item:Model Class
 * Author: Rethabile Ntsekhe (220455430)
 * Date: 24 March 2024
 */

public class OrderItem {
    private int orderItemID;
    private Order orderID;
    private Product productID;
    private int quantity;
    private double unitPrice;

    public OrderItem() {
    }

    public OrderItem(Builder builder) {
        this.orderItemID = builder.orderItemID;
        this.orderID = builder.orderID;
        this.productID = builder.productID;
        this.quantity = builder.quantity;
        this.unitPrice = builder.unitPrice;
    }

    public int getOrderItemID() {
        return orderItemID;
    }

    public void setOrderItemID(int orderItemID) {
        this.orderItemID = orderItemID;
    }

    public Order getOrderID() {
        return orderID;
    }

    public void setOrderID(Order orderID) {
        this.orderID = orderID;
    }

    public Product getProductID() {
        return productID;
    }

    public void setProductID(Product productID) {
        this.productID = productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return ", OrderItem: " +
                ", OrderItemID: " + orderItemID +
                ", OrderID: " + orderID +
                ", ProductID: " + productID +
                ", Quantity: " + quantity +
                ", Price: " + unitPrice +
                '}';
    }

    public static class Builder{
        private int orderItemID;
        private Order orderID;
        private Product productID;
        private int quantity;
        private double unitPrice;

        public Builder setOrderItemID(int orderItemID) {
            this.orderItemID = orderItemID;
            return this;
        }

        public Builder setOrderID(Order orderID) {
            this.orderID = orderID;
            return this;
        }

        public Builder setProductID(Product productID) {
            this.productID = productID;
            return this;
        }

        public Builder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder setUnitPrice(double unitPrice) {
            this.unitPrice = unitPrice;
            return this;
        }

        public OrderItem build(){
            return new OrderItem(this);
        }
    }
}
