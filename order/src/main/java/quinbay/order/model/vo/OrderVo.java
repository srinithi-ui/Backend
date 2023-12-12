package quinbay.order.model.vo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.bson.types.ObjectId;

@Data

public class OrderVo {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private long id;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer customerId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int productId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int quantity;
//    @JsonInclude(JsonInclude.Include.NON_NULL)
//    private int price;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public Integer getCustomerId() {
//        return customerId;
//    }
//
//    public void setCustomerId(Integer customerId) {
//        this.customerId = customerId;
//    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
}
