package za.ac.cput.repository.impl;

import za.ac.cput.domain.Order;

public interface IOrderRepository {
    Order create(Order order);

    Order read(int orderID);

    boolean update(Order updatedOrder);

    boolean delete(int orderID);
}
