package ma.ac.upf.linequiz.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ac.upf.linequiz.entitys.ReponsePossibleEntity;
import ma.ac.upf.linequiz.repositorys.ReponsePossibleRepository;
import ma.ac.upf.linequiz.services.ReponsePossibleService;

@Service("reponsePossibleService")
public class ReponsePossibleServiceImpl implements ReponsePossibleService{

	@Autowired
	private ReponsePossibleRepository reponsePossibleRepository;

	@Override
	public Optional<ReponsePossibleEntity> getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<List<ReponsePossibleEntity>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(ReponsePossibleEntity obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(Iterable<ReponsePossibleEntity> objs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ReponsePossibleEntity obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<ReponsePossibleEntity> objs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(ReponsePossibleEntity obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
