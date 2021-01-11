package ma.ac.upf.linequiz.repositorys;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ma.ac.upf.linequiz.entitys.TestEntity;

@Repository("testRepo")
public interface TestRepository extends CrudRepository<TestEntity, Long /*id*/>{

}
