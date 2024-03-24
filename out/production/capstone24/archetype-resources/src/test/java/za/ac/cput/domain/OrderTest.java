package za.ac.cput.domain;

import org.junit.jupiter.api.Test;

class OrderTest {

    // Testing getter method getOrderItems()
    @Test
    void getOrderItems_shouldReturnListOfOrderItems() {
        // Arrange
        List<OrderItem> orderItems = new ArrayList<>();
        orderItems.add(new OrderItem("Item1", 2, 10.0)); // Creating dummy OrderItems
        Order order = new Order.Builder().setOrderItems(orderItems).build();

        // Act
        List<OrderItem> retrievedOrderItems = order.getOrderItems();

        // Assert
        assertEquals(orderItems, retrievedOrderItems);
        System.out.println("Test getOrderItems(): " + retrievedOrderItems);
    }

    // Testing setter method setOrderItems(List<OrderItem> orderItems)
    @Test
    void setOrderItems_shouldSetOrderItemsCorrectly() {
        // Arrange
        List<OrderItem> orderItems = new ArrayList<>();
        orderItems.add(new OrderItem("Item2", 1, 20.0)); // Creating dummy OrderItems
        Order order = new Order();

        // Act
        order.setOrderItems(orderItems);

        // Assert
        assertEquals(orderItems, order.getOrderItems());
        System.out.println("Test setOrderItems(): " + order.getOrderItems());
    }

    // Testing getter method getTotalPrice()
    @Test
    void getTotalPrice_shouldReturnTotalPrice() {
        // Arrange
        double totalPrice = 100.0;
        Order order = new Order.Builder().setTotalPrice(totalPrice).build();

        // Act
        double retrievedTotalPrice = order.getTotalPrice();

        // Assert
        assertEquals(totalPrice, retrievedTotalPrice);
        System.out.println("Test getTotalPrice(): " + retrievedTotalPrice);
    }

    // Testing setter method setStatus(String status)
    @Test
    void setStatus_shouldSetStatusCorrectly() {
        // Arrange
        String status = "Completed";
        Order order = new Order();

        // Act
        order.setStatus(status);

        // Assert
        assertEquals(status, order.getStatus());
        System.out.println("Test setStatus(): " + order.getStatus());
    }

    // Testing toString() method
    @Test
    void testToString_shouldReturnStringRepresentationOfOrder() {
        // Arrange
        // Create an Order object with some dummy data
        Order order = new Order.Builder()
                .setOrderID(1)
                .setOrderDate(LocalDateTime.now())
                .setCustomer(new Customer("John Doe", "john@example.com")) // Creating a dummy Customer
                .setOrderItems(new ArrayList<>()) // No order items for simplicity
                .setTotalPrice(100.0)
                .setStatus("Pending")
                .setAddressID(new Address("123 Main St", "City", "12345")) // Creating a dummy Address
                .setOrderItemID(new OrderItem("Item3", 3, 30.0)) // Creating a dummy OrderItem
                .build();

        // Act
        String stringRepresentation = order.toString();

        // Assert
        assertNotNull(stringRepresentation);
        // Add more specific assertions based on the expected string representation format
        // Example: assertTrue(stringRepresentation.contains("OrderID: 1"));
        System.out.println("Test toString(): " + stringRepresentation);
    }
}
