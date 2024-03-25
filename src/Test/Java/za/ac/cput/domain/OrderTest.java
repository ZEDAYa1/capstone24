package za.ac.cput.domain;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OrderTest {

    @Test
    void getTotalPrice() {
        double totalPrice = 100.0;
        Order order = new Order.Builder().setTotalPrice(totalPrice).build();

        double retrievedTotalPrice = order.getTotalPrice();

        assertEquals(totalPrice, retrievedTotalPrice);
        System.out.println("Test getTotalPrice " + retrievedTotalPrice);
    }
    @Test
    void setStatus_() {
        String status = "Completed";
        Order order = new Order();

        order.setStatus(status);
        assertNotNull(status);
        assertEquals(status, order.getStatus());
        System.out.println("Test setStatus: " + order.getStatus());
    }

    @Test
    void testToString() {
        Order.Builder builder = new Order.Builder();
        builder.setOrderID(1);
        builder.setOrderDate(LocalDateTime.now());
        builder.setCustomer(new Customer());
        builder.setOrderItems(new ArrayList<>());
        builder.setTotalPrice(100.0);
        builder.setStatus("Pending");
        builder.setAddressID(null);
        builder.setOrderItemID(null);
        /*
        * here i call the object and call the inner build
        * function nested inside for how to display the data inside of it
         */
        Order order = builder.build();


        String stringRepresentation = order.toString();

        assertNotNull(stringRepresentation);
        assertTrue(stringRepresentation.contains("OrderID: 1"));
        System.out.println("Test toString(): " + stringRepresentation);
    }
}
