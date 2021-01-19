package ma.edu.upflinequiz.persistence;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.github.javafaker.Faker;

import ma.ac.upf.linequiz.entitys.CandidatEntity;
import ma.ac.upf.linequiz.repositorys.CandidatRepository;

@SpringBootTest
class CandidatRepositoryTest {

	@Autowired
	CandidatRepository candidatRepository;
	
	@Autowired
	Faker faker;
	
	@Test
	void insertion() {
		
		CandidatEntity candidatEntity = null;// = new CandidatEntity();
				//faker.name().firstName(), faker.name().lastName(), faker.educator().course(), , null, null);
		
		candidatEntity.getNom();
	}

}
