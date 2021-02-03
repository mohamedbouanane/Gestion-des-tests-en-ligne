package ma.edu.upflinequiz.persistence;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import ma.ac.upf.linequiz.dao.UpfLineQuizDAOApplication;
import ma.ac.upf.linequiz.dao.entities.ThemeEntity;
import ma.ac.upf.linequiz.dao.repositories.CandidatRepository;
import ma.ac.upf.linequiz.dao.repositories.CandidatureRepository;
import ma.ac.upf.linequiz.dao.repositories.DateDuTestRepository;
import ma.ac.upf.linequiz.dao.repositories.QuestionRepository;
import ma.ac.upf.linequiz.dao.repositories.ReponsePossibleRepository;
import ma.ac.upf.linequiz.dao.repositories.TestRepository;
import ma.ac.upf.linequiz.dao.repositories.ThemeRepository;

@SpringBootTest
@ContextConfiguration(classes = {UpfLineQuizDAOApplication.class})
class RepositoresTest {

	// Test auto injection
	@Autowired
	CandidatRepository candidatRepository;
	@Autowired
	CandidatureRepository candidatureRepository;
	@Autowired
	DateDuTestRepository DateDuTestRepository;
	@Autowired
	QuestionRepository questionRepository;
	@Autowired
	ReponsePossibleRepository reponsePossibleRepository;
	@Autowired
	TestRepository testRepository;
	@Autowired
	ThemeRepository themeRepository;
	
	// To add later Test Database Transactions

	// To add later Test Database Security
}
