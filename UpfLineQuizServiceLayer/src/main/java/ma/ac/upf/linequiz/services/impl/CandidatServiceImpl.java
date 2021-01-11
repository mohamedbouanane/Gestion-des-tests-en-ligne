package ma.ac.upf.linequiz.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ac.upf.linequiz.entitys.CandidatEntity;
import ma.ac.upf.linequiz.repositorys.CandidatRepository;
import ma.ac.upf.linequiz.services.CandidatService;

@Service("candidatService")
public class CandidatServiceImpl implements CandidatService {

	@Autowired
	private CandidatRepository candidatRepository;

	@Override
	public Optional<CandidatEntity> getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<List<CandidatEntity>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(CandidatEntity obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(Iterable<CandidatEntity> objs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(CandidatEntity obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<CandidatEntity> objs) {

	}

	@Override
	public boolean exists(CandidatEntity obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
