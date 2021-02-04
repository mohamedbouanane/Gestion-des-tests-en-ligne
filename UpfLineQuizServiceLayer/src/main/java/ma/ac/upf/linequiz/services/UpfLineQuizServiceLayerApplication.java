package ma.ac.upf.linequiz.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@ComponentScan(basePackages = { "ma.ac.upf.linequiz.services.impl" } )
//@EnableJpaRepositories
@SpringBootApplication
public class UpfLineQuizServiceLayerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(UpfLineQuizServiceLayerApplication.class, args);
		
	}

}
