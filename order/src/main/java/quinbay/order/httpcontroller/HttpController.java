package quinbay.order.httpcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import quinbay.order.services.*;
import quinbay.order.model.entity.Order;
import quinbay.order.model.vo.OrderVo;
import java.util.List;

@RestController
@RequestMapping("/httpmethod")


public class HttpController {
    @Autowired
    service services;

    @GetMapping("/order")
    public List<Order> getOrderDetails() {
        return services.getAllOrders();
    }
    @GetMapping("/order/customer")
    public List<Order> getOrderDetailsByCustomer(@RequestParam int id) {
        return services.getOrdersByCustomer(id);
    }
    @PostMapping("/order/add")
    public String postOrderDetails(@RequestBody OrderVo order) {
        return services.addOrder(order);
    }



}
