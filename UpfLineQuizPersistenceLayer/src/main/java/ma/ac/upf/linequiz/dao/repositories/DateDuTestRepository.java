package ma.ac.upf.linequiz.dao.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ma.ac.upf.linequiz.dao.entities.DateDuTestEntity;

@Repository("dateDuTestRepo")
public interface DateDuTestRepository extends CrudRepository<DateDuTestEntity, Long>{

}
