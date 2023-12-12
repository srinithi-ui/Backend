package quinbay.Personalize.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PersonalizeVo {
    private Long id;

    private Long customerId;

    private Long productId;
}
