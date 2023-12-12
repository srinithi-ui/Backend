package quinbay.Personalize.dao.api;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import quinbay.Personalize.model.vo.PersonalizeVo;
//import quinbay.Personalize.services.PersonalizeInterface;
import quinbay.Personalize.model.entity.Personalize;

import java.util.List;
//@EnableJpaRepositories
@EnableAutoConfiguration
public interface PersonalizeRepository extends JpaRepository<Personalize, Long> {

//    @Override
    List<Personalize> findAll();

    Personalize save(Personalize personalize);

}