package ma.ac.upf.linequiz.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ac.upf.linequiz.entitys.QuestionEntity;
import ma.ac.upf.linequiz.repositorys.QuestionRepository;
import ma.ac.upf.linequiz.services.QuestionService;

@Service("questionService")
public class QuestionServiceImpl implements QuestionService{

	@Autowired
	private QuestionRepository questionRepository;

	@Override
	public Optional<QuestionEntity> getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<List<QuestionEntity>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(QuestionEntity obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(Iterable<QuestionEntity> objs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(QuestionEntity obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<QuestionEntity> objs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(QuestionEntity obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
