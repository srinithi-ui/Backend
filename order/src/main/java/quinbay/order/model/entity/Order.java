package quinbay.order.model.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document(collection = "orders")
public class Order {


        @Id
        @JsonInclude(JsonInclude.Include.NON_NULL)

        private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int customerId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long productId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int quantity;
//    @JsonInclude(JsonInclude.Include.NON_NULL)
//    private int price;

//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
