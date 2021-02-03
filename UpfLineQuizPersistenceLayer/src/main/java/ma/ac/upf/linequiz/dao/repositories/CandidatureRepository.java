package ma.ac.upf.linequiz.repositorys;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ma.ac.upf.linequiz.entitys.CandidatureEntity;

@Repository("candidatureRepo")
public interface CandidatureRepository extends CrudRepository<CandidatureEntity, Long /*id data type*/>{

}
