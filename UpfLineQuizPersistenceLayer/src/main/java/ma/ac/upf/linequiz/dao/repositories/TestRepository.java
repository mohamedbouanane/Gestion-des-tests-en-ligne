package ma.ac.upf.linequiz.dao.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ma.ac.upf.linequiz.dao.entities.TestEntity;

@Repository("testRepo")
public interface TestRepository extends CrudRepository<TestEntity, Long>{

}
