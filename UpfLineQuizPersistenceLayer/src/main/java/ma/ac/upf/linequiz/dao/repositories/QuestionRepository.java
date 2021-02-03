package ma.ac.upf.linequiz.dao.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ma.ac.upf.linequiz.dao.entities.QuestionEntity;

@Repository("questionRepo")
public interface QuestionRepository extends CrudRepository<QuestionEntity, Long>{

}
