package za.ac.cput.factory;

import za.ac.cput.domain.*;
import za.ac.cput.util.Helper;
import java.time.LocalDateTime;
import java.util.List;
/*
 *OrderFactory: java
 *Order:factory Class
 * Author: Rethabile Ntsekhe (220455430)
 * Date: 24 March 2024
 */
public class OrderFactory {
    public static Order createOrder(int orderID, LocalDateTime orderDate, Customer customer,
                                    List<OrderItem> orderItems, Double totalPrice, String status,
                                    Address addressID, OrderItem orderItemID) {

        if (Helper.isNullOrEmpty(String.valueOf(orderID)) ||
                Helper.isNullOrEmpty(orderDate) ||
                Helper.isNullOrEmpty(orderItems) ||
                Helper.isOrderNullorEmpty(totalPrice) ||
                Helper.isNullOrEmpty(String.valueOf(addressID))) {
            return null;
        }

        // Create and return the Order object if all conditions are met
        return new Order.Builder()
                .setOrderID(orderID)
                .setOrderDate(orderDate)
                .setCustomer(customer)
                .setOrderItems(orderItems)
                .setTotalPrice(totalPrice)
                .setStatus(status)
                .setAddressID(addressID)
                .setOrderItemID(orderItemID)
                .build();
    }
}
