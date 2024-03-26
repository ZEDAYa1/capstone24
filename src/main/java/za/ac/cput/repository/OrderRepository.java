package za.ac.cput.repository;

import za.ac.cput.domain.Order;
import za.ac.cput.repository.impl.IOrderRepository;

import java.util.ArrayList;
import java.util.List;

public class OrderRepository implements IOrderRepository {

    private static OrderRepository repository = null;
    private static List<Order> orderlist;

    private OrderRepository() {
        orderlist = new ArrayList<>();
    }

    public static OrderRepository getRepository() {
        if (repository == null) {
            repository = new OrderRepository();
        }
        return repository;
    }

    @Override
    public Order create(Order order) {
        boolean created = orderlist.add(order);
        if (created) {
            return order;
        }
        return null;
    }

    @Override
    public Order read(int orderID) {
        for (Order order : orderlist) {
            if (order.getOrderID() == orderID) {
                return order;
            }
        }
        return null;
    }

    @Override
    public boolean update(Order updatedOrder) {
        for (int i = 0; i < orderlist.size(); i++) {
            Order order = orderlist.get(i);
            if (order.getOrderID() == updatedOrder.getOrderID()) {
                orderlist.set(i, updatedOrder);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(int orderID) {
        for (Order order : orderlist) {
            if (order.getOrderID() == orderID) {
                return orderlist.remove(order);
            }
        }
        return false;
    }
}
