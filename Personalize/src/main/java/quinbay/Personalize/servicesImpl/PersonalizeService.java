package quinbay.Personalize.servicesImpl;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import quinbay.Personalize.dao.api.PersonalizeRepository;
import quinbay.Personalize.model.vo.PersonalizeVo;
import quinbay.Personalize.model.entity.Personalize;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import quinbay.Personalize.model.vo.ProductVo;
import quinbay.Personalize.services.PersonalizeInterface;

@Service
public class PersonalizeService implements PersonalizeInterface {


    @Autowired
    PersonalizeRepository personalizeRepo;
    public List<PersonalizeVo> getRecommendations(long customerId) {


            List<quinbay.Personalize.model.entity.Personalize> productList=personalizeRepo.findAll();

            ObjectMapper objectMapper=new ObjectMapper();

            List<PersonalizeVo> recommendations= objectMapper.convertValue(productList,List.class);

            return recommendations;

        }


    @Override
    public String addRecommendation(PersonalizeVo personalizeVo) {
        try{
            ObjectMapper objectMapper=new ObjectMapper();
            personalizeRepo.save(objectMapper.convertValue(personalizeVo, quinbay.Personalize.model.entity.Personalize.class));
            return "Done";

        }catch (Exception e){
            e.printStackTrace();
        }
        return "Not done";
    }
    @KafkaListener(topics = "com.quinbay.product.create", groupId = "group-id")
    public void listen(String message) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        ProductVo p = objectMapper.readValue(message, ProductVo.class);
        System.out.println("received: " + p);
    }
}
