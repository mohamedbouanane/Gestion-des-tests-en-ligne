package ma.ac.upf.linequiz.services.impl;

import java.util.ArrayList;
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
		return questionRepository.findById(id);
	}

	@Override
	public Optional<List<QuestionEntity>> getAll() {
		List<QuestionEntity> lsAccounts = new ArrayList<>();
		questionRepository.findAll().forEach(lsAccounts::add);
		return Optional.ofNullable(lsAccounts);
	}

	@Override
	public boolean existsById(Long id) {
		return questionRepository.existsById(id);
	}
	
	@Override
	public void save(QuestionEntity obj) {
		questionRepository.save(obj);
	}

	@Override
	public void save(Iterable<QuestionEntity> objs) {
		questionRepository.saveAll(objs);		
	}

	@Override
	public void deleteById(Long id) {
		questionRepository.deleteById(id);
	}

	@Override
	public void delete(QuestionEntity obj) {
		questionRepository.delete(obj);
	}

	@Override
	public void deleteAll(Iterable<QuestionEntity> objs) {
		questionRepository.deleteAll(objs);
	}
	
}
