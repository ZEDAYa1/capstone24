package za.ac.cput.Domain;

/*
 *Order: java
 *Order: Model Class
 * Author: Rethabile Ntsekhe (220455430)
 * Date: 19 March 2024
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
