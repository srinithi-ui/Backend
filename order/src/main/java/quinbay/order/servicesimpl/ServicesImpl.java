package quinbay.order.servicesimpl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;
import quinbay.order.api.OrderRepository;
import quinbay.order.services.*;
import quinbay.order.model.entity.Order;
import  quinbay.order.model.vo.OrderVo;

import java.util.Arrays;
import java.util.List;
import quinbay.order.model.vo.OrderVo;
@Service
public class ServicesImpl implements service {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    OrderRepository orderRepository;

    private String baseUrl = "http://localhost:8091/httpmethod";


    public List<Order> getAllOrders() {
        List<quinbay.order.model.entity.Order> order = orderRepository.findAll();
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.convertValue(order, List.class);


    }


    public List<Order> getOrdersByCustomer(int customerId) {
        List<quinbay.order.model.entity.Order> order = orderRepository.findByCustomerId(customerId);
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.convertValue(order, List.class);
    }


    public String addOrder(OrderVo orderVo){
        ObjectMapper objectMapper = new ObjectMapper();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<>( headers);
        System.out.println(orderVo.getProductId());
        UriComponents builder = UriComponentsBuilder.fromHttpUrl("http://localhost:8099/httpmethod/product/check").queryParam("id",orderVo.getId()).queryParam("quantity",orderVo.getQuantity()).build();

        boolean checker = restTemplate.exchange(builder.toUriString(), HttpMethod.GET, entity, boolean.class).getBody();

        if(checker) {
            orderRepository.save(objectMapper.convertValue(orderVo, quinbay.order.model.entity.Order.class));
            return "done";
        }
        else return "Not available";


    }
}
