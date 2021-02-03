package ma.ac.upf.linequiz.services.businessservices.businessservicesimpl;

import org.springframework.stereotype.Service;

import ma.ac.upf.linequiz.dao.entities.CandidatEntity;
import ma.ac.upf.linequiz.dao.repositories.CandidatRepository;
import ma.ac.upf.linequiz.services.businessservices.CandidatService;

@Service("candidatService")
public class CandidatServiceImpl extends CrudServiceImpl<CandidatEntity, Long, CandidatRepository> implements CandidatService {

}
