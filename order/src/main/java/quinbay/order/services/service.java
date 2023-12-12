package quinbay.order.services;

import java.util.List;

import  quinbay.order.model.entity.Order;
import quinbay.order.model.vo.OrderVo;

public interface service {
    List<Order> getAllOrders();
    List<Order> getOrdersByCustomer(int customerId);
    String addOrder(OrderVo order);

}
