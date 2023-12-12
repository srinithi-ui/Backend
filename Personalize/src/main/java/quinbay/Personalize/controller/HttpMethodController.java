package quinbay.Personalize.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import quinbay.Personalize.model.vo.PersonalizeVo;
import quinbay.Personalize.services.PersonalizeInterface;
import quinbay.Personalize.model.entity.Personalize;
import quinbay.Personalize.servicesImpl.PersonalizeService;

import java.util.List;

@RestController
@RequestMapping("/httpmethod")
public class HttpMethodController {

    @Autowired
    PersonalizeService service;

    @GetMapping("/getRecommendations")
    public List<PersonalizeVo> getRecommendations(@RequestParam Long id) {
        return service.getRecommendations(id);
    }

    @PostMapping("/addRecommendation")
    public String addRecommendation(@RequestBody PersonalizeVo personalizeVo) {

        return service.addRecommendation(personalizeVo);

    }
}