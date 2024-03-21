package za.ac.cput.domain;

/*
 *Order: java
 *Order: Model Class
 * Author:
 * Date:
 */

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private long id;
    private Customer customer;
    private List<OrderItem> items;
    private LocalDateTime orderDate;
    private double totalPrice;
    private String status;
}
