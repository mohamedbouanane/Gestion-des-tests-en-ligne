package ma.ac.upf.linequiz.services.businessservices.businessservicesimpl;

import org.springframework.stereotype.Service;

import ma.ac.upf.linequiz.dao.entities.TestEntity;
import ma.ac.upf.linequiz.dao.repositories.TestRepository;
import ma.ac.upf.linequiz.services.businessservices.TestService;

@Service("testService")
public class TestServiceImpl extends CrudServiceImpl<TestEntity, Long, TestRepository> implements TestService {
	
}
