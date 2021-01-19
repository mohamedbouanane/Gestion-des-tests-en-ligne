package ma.ac.upf.linequiz.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ac.upf.linequiz.entitys.CandidatEntity;
import ma.ac.upf.linequiz.repositorys.CandidatRepository;
import ma.ac.upf.linequiz.services.CandidatService;

//Business Service
@Service("candidatService")
public class CandidatServiceImpl implements CandidatService {

	@Autowired
	private CandidatRepository candidatRepository;

	@Override
	public Optional<CandidatEntity> getById(Long id) {
		return candidatRepository.findById(id);
	}

	@Override
	public Optional<List<CandidatEntity>> getAll() {
		List<CandidatEntity> lsAccounts = new ArrayList<>();
		candidatRepository.findAll().forEach(lsAccounts::add);
		return Optional.ofNullable(lsAccounts);
	}
	
	@Override
	public boolean existsById(Long id) {
		return candidatRepository.existsById(id);
	}

	@Override
	public void save(CandidatEntity obj) {
		candidatRepository.save(obj);		
	}

	@Override
	public void save(Iterable<CandidatEntity> objs) {
		candidatRepository.saveAll(objs);		
	}

	@Override
	public void deleteById(Long id) {
		candidatRepository.deleteById(id);
	}

	@Override
	public void delete(CandidatEntity obj) {
		candidatRepository.delete(obj);		
	}

	@Override
	public void deleteAll(Iterable<CandidatEntity> objs) {
		candidatRepository.deleteAll(objs);
	}
	
}
