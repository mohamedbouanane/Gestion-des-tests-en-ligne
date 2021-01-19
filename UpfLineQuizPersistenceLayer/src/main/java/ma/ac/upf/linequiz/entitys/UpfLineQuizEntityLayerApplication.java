package ma.ac.upf.linequiz.entitys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class UpfLineQuizEntityLayerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UpfLineQuizEntityLayerApplication.class, args);
	}

}
