package ma.edu.upflinequiz.services;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ma.ac.upf.linequiz.dao.UpfLineQuizDAOApplication;
import ma.ac.upf.linequiz.dao.entities.CandidatEntity;
import ma.ac.upf.linequiz.dao.entities.ThemeEntity;
import ma.ac.upf.linequiz.dao.entities.UtilisateurEntity;
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
	UtilisateurService utilisateurService;
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

    	CandidatEntity candidatEntity1 = new CandidatEntity();
    	CandidatEntity candidatEntity2 = new CandidatEntity();
    	CandidatEntity candidatEntity3 = new CandidatEntity();

    	candidatEntity1.setNom("Bouanae");
    	candidatEntity1.setPrenom("Moahmed");
    	candidatEntity1.setEmail("bouananemohamd@gmail.com");
    	candidatEntity1.setGsm("0641019223");
    	candidatEntity1.setEcole("UPF");
    	candidatEntity1.setFiliere("Génie informatique");
    	
    	candidatEntity2.setNom("Bouanae");
    	candidatEntity2.setPrenom("Moahmed");
    	candidatEntity2.setEmail("bouananemohamd@gmail.com");
    	candidatEntity2.setGsm("0641019223");
    	candidatEntity2.setEcole("UPF");
    	candidatEntity2.setFiliere("Génie informatique");
    	
    	candidatEntity3.setNom("Bouanae");
    	candidatEntity3.setPrenom("Moahmed");
    	candidatEntity3.setEmail("bouananemohamd@gmail.com");
    	candidatEntity3.setGsm("0641019223");
    	candidatEntity3.setEcole("UPF");
    	candidatEntity3.setFiliere("Génie informatique");
    	
    	
    	UtilisateurEntity utilisateurEntity1 = new UtilisateurEntity();
    	UtilisateurEntity utilisateurEntity2 = new UtilisateurEntity();
    	UtilisateurEntity utilisateurEntity3 = new UtilisateurEntity();
    	
    	utilisateurEntity1.setLogin("login1");
    	utilisateurEntity1.setPassword("password1");
    	utilisateurEntity1.setCandidat(candidatEntity1);
    	
    	utilisateurEntity1.setLogin("login2");
    	utilisateurEntity1.setPassword("password2");
    	utilisateurEntity1.setCandidat(candidatEntity1);
    	
    	utilisateurEntity1.setLogin("login3");
    	utilisateurEntity1.setPassword("password3");
    	utilisateurEntity1.setCandidat(candidatEntity1);
    	
    	utilisateurService.saveAll(
    			utilisateurEntity1,
    			utilisateurEntity2,
    			utilisateurEntity3
    			);
    	
    	
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
