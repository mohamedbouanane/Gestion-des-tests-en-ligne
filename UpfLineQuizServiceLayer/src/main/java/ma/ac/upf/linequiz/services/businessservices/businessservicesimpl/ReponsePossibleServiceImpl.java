package ma.ac.upf.linequiz.services.impl;

import java.util.ArrayList;
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
		return reponsePossibleRepository.findById(id);
	}

	@Override
	public Optional<List<ReponsePossibleEntity>> getAll() {
		List<ReponsePossibleEntity> lsAccounts = new ArrayList<>();
		reponsePossibleRepository.findAll().forEach(lsAccounts::add);
		return Optional.ofNullable(lsAccounts);
	}

	@Override
	public boolean existsById(Long id) {
		return reponsePossibleRepository.existsById(id);
	}
	
	@Override
	public void save(ReponsePossibleEntity obj) {
		reponsePossibleRepository.save(obj);
	}

	@Override
	public void save(Iterable<ReponsePossibleEntity> objs) {
		reponsePossibleRepository.saveAll(objs);
	}

	@Override
	public void deleteById(Long id) {
		reponsePossibleRepository.deleteById(id);
	}

	@Override
	public void delete(ReponsePossibleEntity obj) {
		reponsePossibleRepository.delete(obj);
	}

	@Override
	public void deleteAll(Iterable<ReponsePossibleEntity> objs) {
		reponsePossibleRepository.deleteAll(objs);
	}

}
