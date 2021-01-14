package ma.ac.upf.linequiz.services.impl;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<List<TestEntity>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(TestEntity obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(Iterable<TestEntity> objs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(TestEntity obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<TestEntity> objs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
