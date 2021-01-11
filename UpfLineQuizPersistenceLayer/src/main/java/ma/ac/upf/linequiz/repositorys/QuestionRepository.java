package ma.ac.upf.linequiz.repositorys;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ma.ac.upf.linequiz.entitys.QuestionEntity;

@Repository("questionRepo")
public interface QuestionRepository extends CrudRepository<QuestionEntity, Long /*id*/>{

}
