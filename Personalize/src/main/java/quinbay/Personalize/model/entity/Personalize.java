package quinbay.Personalize.model.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@AllArgsConstructor
@Table(name = "recommendations")
@NoArgsConstructor
@ToString
@Entity
public class Personalize {
    @Id
    @JsonInclude(JsonInclude.Include.NON_NULL)

    @Column(name  = "id")
    private Long id;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Column(name  = "customerid")
    private Long customerId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Column(name  = "productid")
    private Long productId;


}
