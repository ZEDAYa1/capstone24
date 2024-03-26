package za.ac.cput.domain;

/*
 *Order: java
 *Order:Model Class
 * Author: Rethabile Ntsekhe (220455430)
 * Date: 24 March 2024
 */

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;

        Order order = (Order) o;

        if (orderID != order.orderID) return false;
        if (Double.compare(totalPrice, order.totalPrice) != 0) return false;
        if (!orderDate.equals(order.orderDate)) return false;
        if (!Objects.equals(customer, order.customer)) return false;
        if (!orderItems.equals(order.orderItems)) return false;
        if (!Objects.equals(status, order.status)) return false;
        if (!addressID.equals(order.addressID)) return false;
        return orderItemID.equals(order.orderItemID);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = orderID;
        result = 31 * result + orderDate.hashCode();
        result = 31 * result + (customer != null ? customer.hashCode() : 0);
        result = 31 * result + orderItems.hashCode();
        temp = Double.doubleToLongBits(totalPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + addressID.hashCode();
        result = 31 * result + orderItemID.hashCode();
        return result;
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
            this.orderID = orderID;
            this.orderDate = orderDate;
            this.customer =customer;
            this.orderItems = orderItems;
            this.totalPrice = totalPrice;
            this.status = status;
            return this;
        }
        public Order build(){
            Order order = new Order(this);
            return order;
        }
    }
}
