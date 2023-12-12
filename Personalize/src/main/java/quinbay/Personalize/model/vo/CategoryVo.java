package quinbay.Personalize.model.vo;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
@Data
public class CategoryVo {
    private Long id;
    private String name;
//
//    @JsonManagedReference
//    public List<Product> productsList;

}

