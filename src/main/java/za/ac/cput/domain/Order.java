package za.ac.cput.domain;

/*
 *Order: java
 *Order:Model Class
 * Author: Rethabile Ntsekhe (220455430)
 * Date: 24 March 2024
 */

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private int orderID;
    private LocalDateTime orderDate;
    private Customer customer;
    private List<OrderItem> orderItems;
    private double totalPrice;
    private String status;
    private Address addressID;
    private OrderItem orderItemID;

    public Order(){

    }

    private Order(Builder builder) {
        this.orderID = builder.orderID;
        this.orderDate = builder.orderDate;
        this.customer = builder.customer;
        this.orderItems = builder.orderItems;
        this.totalPrice = builder.totalPrice;
        this.status = builder.status;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Address getAddressID() {
        return addressID;
    }

    public void setAddressID(Address addressID) {
        this.addressID = addressID;
    }

    public OrderItem getOrderItemID() {
        return orderItemID;
    }

    public void setOrderItemID(OrderItem orderItemID) {
        this.orderItemID = orderItemID;
    }

    @Override
    public String toString() {
        return "Order{" +
                ", OrderID: " + orderID +
                ", OrderDate: " + orderDate +
                ", Customer: " + customer +
                ", OrderItems: " + orderItems +
                ", TotalPrice: " + totalPrice +
                ", Status: " + status + '\'' +
                ", AddressID: " + addressID +
                ", OrderItemID: " + orderItemID +
                '}';
    }

    public static class Builder{
        private int orderID;
        private LocalDateTime orderDate;
        private Customer customer;
        private List<OrderItem> orderItems;
        private double totalPrice;
        private String status;
        private Address addressID;
        private OrderItem orderItemID;

        public Order.Builder setOrderID(int orderID) {
            this.orderID = orderID;
            return this;
        }

        public Order.Builder setOrderDate(LocalDateTime orderDate) {
            this.orderDate = orderDate;
            return this;
        }

        public Order.Builder setCustomer(Customer customer) {
            this.customer = customer;
            return this;
        }

        public Order.Builder setOrderItems(List<OrderItem> orderItems) {
            this.orderItems = orderItems;
            return this;
        }

        public Order.Builder setTotalPrice(double totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }

        public Order.Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Order.Builder setAddressID(Address addressID) {
            this.addressID = addressID;
            return this;
        }

        public Order.Builder setOrderItemID(OrderItem orderItemID) {
            this.orderItemID = orderItemID;
            return this;
        }
        /*
         *so this method below takes the elements into the builder nested class
         * and creates a copy
         */
        public Order.Builder copy(Order order) {
            this.orderID = order.orderID;
            this.orderDate = order.orderDate;
            this.customer = order.customer;
            this.orderItems = order.orderItems;
            this.totalPrice = order.totalPrice;
            this.status = order.status;
            return this;
        }
        public Order build(){
            Order order = new Order(this);
            return order;
        }
    }
}
