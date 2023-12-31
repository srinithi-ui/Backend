package quinbay.Personalize.model.vo;



import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductVo {
    private long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String name;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int quantity;
    private int categoryId;
    //    @JsonBackReference
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private CategoryVo category;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int productId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int orderId;



}
