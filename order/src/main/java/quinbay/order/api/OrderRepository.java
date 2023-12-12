package quinbay.order.api;

import org.springframework.data.mongodb.repository.MongoRepository;
import quinbay.order.model.entity.Order;
import quinbay.order.model.vo.OrderVo;

import java.util.List;

public interface OrderRepository extends MongoRepository<Order, String> {
    @Override
    List<Order> findAll();
    List<Order> findByCustomerId(int customerId);

    @Override
    Order save(Order order);


}
