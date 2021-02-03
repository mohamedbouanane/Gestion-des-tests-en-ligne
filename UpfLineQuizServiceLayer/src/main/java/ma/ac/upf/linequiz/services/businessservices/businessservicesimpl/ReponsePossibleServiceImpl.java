package ma.ac.upf.linequiz.services.businessservices.businessservicesimpl;

import org.springframework.stereotype.Service;

import ma.ac.upf.linequiz.dao.entities.ReponsePossibleEntity;
import ma.ac.upf.linequiz.dao.repositories.ReponsePossibleRepository;
import ma.ac.upf.linequiz.services.businessservices.ReponsePossibleService;

@Service("reponsePossibleService")
public class ReponsePossibleServiceImpl extends CrudServiceImpl<ReponsePossibleEntity, Long, ReponsePossibleRepository> implements ReponsePossibleService{

}
