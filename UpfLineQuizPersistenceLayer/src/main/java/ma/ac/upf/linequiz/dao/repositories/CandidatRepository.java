package ma.ac.upf.linequiz.dao.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ma.ac.upf.linequiz.dao.entities.CandidatEntity;

@Repository("candidatRepo")
public interface CandidatRepository extends CrudRepository<CandidatEntity, Long /*id data type*/>{


}
