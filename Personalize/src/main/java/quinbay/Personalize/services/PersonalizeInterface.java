package quinbay.Personalize.services;

import quinbay.Personalize.model.vo.PersonalizeVo;

import java.util.List;

public interface PersonalizeInterface {
    List<PersonalizeVo> getRecommendations(long customerId);
    String addRecommendation(PersonalizeVo personalizeVo);
}
