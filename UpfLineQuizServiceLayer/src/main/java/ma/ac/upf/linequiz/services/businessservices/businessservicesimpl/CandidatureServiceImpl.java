package ma.ac.upf.linequiz.services.businessservices.businessservicesimpl;

import org.springframework.stereotype.Service;

import ma.ac.upf.linequiz.dao.entities.CandidatureEntity;
import ma.ac.upf.linequiz.dao.repositories.CandidatureRepository;
import ma.ac.upf.linequiz.services.businessservices.CandidatureService;

@Service("candidatureService")
public class CandidatureServiceImpl extends CrudServiceImpl<CandidatureEntity, Long, CandidatureRepository> implements CandidatureService {
	
}
