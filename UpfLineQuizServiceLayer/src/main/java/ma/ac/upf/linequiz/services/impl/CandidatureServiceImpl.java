package ma.ac.upf.linequiz.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ac.upf.linequiz.entitys.CandidatureEntity;
import ma.ac.upf.linequiz.repositorys.CandidatureRepository;
import ma.ac.upf.linequiz.services.CandidatureService;

@Service("candidatureService")
public class CandidatureServiceImpl implements CandidatureService {

	@Autowired
	private CandidatureRepository candidatureRepository;

	@Override
	public Optional<CandidatureEntity> getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<List<CandidatureEntity>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(CandidatureEntity obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(Iterable<CandidatureEntity> objs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(CandidatureEntity obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<CandidatureEntity> objs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(CandidatureEntity obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
