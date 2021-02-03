package ma.ac.upf.linequiz.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ac.upf.linequiz.entitys.TestEntity;
import ma.ac.upf.linequiz.repositorys.TestRepository;
import ma.ac.upf.linequiz.services.TestService;

@Service("testService")
public class TestServiceImpl implements TestService {

	@Autowired
	private TestRepository testRepository;

	@Override
	public Optional<TestEntity> getById(Long id) {
		return testRepository.findById(id);
	}

	@Override
	public Optional<List<TestEntity>> getAll() {
		List<TestEntity> lsAccounts = new ArrayList<>();
		testRepository.findAll().forEach(lsAccounts::add);
		return Optional.ofNullable(lsAccounts);
	}

	@Override
	public boolean existsById(Long id) {
		return testRepository.existsById(id);
	}
	
	@Override
	public void save(TestEntity obj) {
		testRepository.save(obj);
	}

	@Override
	public void save(Iterable<TestEntity> objs) {
		testRepository.saveAll(objs);
	}

	@Override
	public void deleteById(Long id) {
		testRepository.deleteById(id);
	}

	@Override
	public void delete(TestEntity obj) {
		testRepository.delete(obj);
	}

	@Override
	public void deleteAll(Iterable<TestEntity> objs) {
		testRepository.deleteAll(objs);
	}


	
}
