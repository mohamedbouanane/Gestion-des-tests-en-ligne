package ma.ac.upf.linequiz.dao.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ma.ac.upf.linequiz.dao.entities.ReponsePossibleEntity;

@Repository("reponsePossibleRepo")
public interface ReponsePossibleRepository extends CrudRepository<ReponsePossibleEntity, Long>{

}
