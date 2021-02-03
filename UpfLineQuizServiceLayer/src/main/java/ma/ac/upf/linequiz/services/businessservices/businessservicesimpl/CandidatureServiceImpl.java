package ma.ac.upf.linequiz.services.impl;

import java.util.ArrayList;
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
		return candidatureRepository.findById(id);
	}

	@Override
	public Optional<List<CandidatureEntity>> getAll() {
		List<CandidatureEntity> lsAccounts = new ArrayList<>();
		candidatureRepository.findAll().forEach(lsAccounts::add);
		return Optional.ofNullable(lsAccounts);
	}

	@Override
	public boolean existsById(Long id) {
		return candidatureRepository.existsById(id);
	}
	
	@Override
	public void save(CandidatureEntity obj) {
		candidatureRepository.save(obj);	
	}

	@Override
	public void save(Iterable<CandidatureEntity> objs) {
		candidatureRepository.saveAll(objs);
	}

	@Override
	public void deleteById(Long id) {
		candidatureRepository.deleteById(id);
	}

	@Override
	public void delete(CandidatureEntity obj) {
		candidatureRepository.delete(obj);	
	}

	@Override
	public void deleteAll(Iterable<CandidatureEntity> objs) {
		candidatureRepository.deleteAll(objs);
	}
	
}
