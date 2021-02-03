package ma.edu.upflinequiz.services;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ma.ac.upf.linequiz.dao.UpfLineQuizDAOApplication;
import ma.ac.upf.linequiz.dao.entities.ThemeEntity;
import ma.ac.upf.linequiz.services.UpfLineQuizServiceLayerApplication;
import ma.ac.upf.linequiz.services.businessservices.CandidatService;
import ma.ac.upf.linequiz.services.businessservices.CandidatureService;
import ma.ac.upf.linequiz.services.businessservices.*;

//@RunWith(SpringRunner.class)
@SpringBootTest(
	    classes = {UpfLineQuizServiceLayerApplication.class, UpfLineQuizDAOApplication.class}
	    //,webEnvironment = WebEnvironment.RANDOM_PORT
	)
public class ServicesTest {
		
	// Test auto injection
	@Autowired
	CandidatService candidatService;
	@Autowired
	CandidatureService candidatureService;
	@Autowired
	DateDuTestService DateDuTestService;
	@Autowired
	QuestionService questionRepository;
	@Autowired
	ReponsePossibleService reponsePossibleService;
	@Autowired
	TestService testService;
	@Autowired
	ThemeService themeService;
	
	Logger logger = Logger.getLogger(ServicesTest.class.getName());
	
	
	//@Autowired
	//Faker faker;
	
	@Test
	void selections() {
		
		//print("\n"+themeService.getById(2L).get().toString()+"\n");
		
	}
	
    @Test
    public void insertions() {

    	themeService.saveAll(
    			new ThemeEntity("Orocle"),
    			new ThemeEntity("MySQL"),
    			new ThemeEntity("C#"),
    			new ThemeEntity("JEE"),
    			new ThemeEntity("Java avancé"),
    			new ThemeEntity("Design pattern"),
    			new ThemeEntity("Qualité logicielle"),
    			new ThemeEntity("Design pattern"),
    			new ThemeEntity("Architecture réseau")
    			);
    	

    	/*
    	candidatService.sa(
    			new CandidatEntity(
    					"Moahmed",
    					"Bouanae",
    					"UPF",
    					"Génie informatique", 
    					"bouananemohamd@gmail.com",
    					"0641019223"
    					));
    	
    	/*
    	Faker faker = new Faker();
    	candidatService.save(
    			new CandidatEntity(
    					faker.name().firstName(),
    					faker.name().lastName(),
    					faker.educator().university(),
    					faker.educator().campus(), 
    					faker.funnyName()+"@upf.ac.ma",
    					faker.phoneNumber().phoneNumber()
    					));
    	*/

    }
    
    void print(String msg) {	
		System.out.println("\n"+msg+"\n");
		//logger.log(Level.FINE, themeService.getById(2L).toString());
	}

}
