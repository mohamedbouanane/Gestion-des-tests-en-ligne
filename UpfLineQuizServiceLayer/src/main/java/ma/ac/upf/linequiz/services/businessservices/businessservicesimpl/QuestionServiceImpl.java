package ma.ac.upf.linequiz.services.businessservices.businessservicesimpl;

import org.springframework.stereotype.Service;

import ma.ac.upf.linequiz.dao.entities.QuestionEntity;
import ma.ac.upf.linequiz.dao.repositories.QuestionRepository;
import ma.ac.upf.linequiz.services.businessservices.QuestionService;

@Service("questionService")
public class QuestionServiceImpl extends CrudServiceImpl<QuestionEntity, Long, QuestionRepository> implements QuestionService{
	
}
