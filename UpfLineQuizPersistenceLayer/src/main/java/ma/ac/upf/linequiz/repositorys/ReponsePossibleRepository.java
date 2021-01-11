package ma.ac.upf.linequiz.repositorys;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ma.ac.upf.linequiz.entitys.ReponsePossibleEntity;

@Repository("reponsePossibleRepo")
public interface ReponsePossibleRepository extends CrudRepository<ReponsePossibleEntity, Long /*id*/>{

}
