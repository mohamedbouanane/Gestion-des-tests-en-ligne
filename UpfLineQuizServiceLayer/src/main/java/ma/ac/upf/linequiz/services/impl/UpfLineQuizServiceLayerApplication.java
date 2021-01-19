package ma.ac.upf.linequiz.services.impl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ma.ac.upf.linequiz.services.mailing.EmailCfg;
import ma.ac.upf.linequiz.services.mailing.MailServiceImpl;

@SpringBootApplication
public class UpfLineQuizServiceLayerApplication {

	public static void main(String[] args) {
		//SpringApplication.run(UpfLineQuizServiceLayerApplication.class, args);
		
		
		EmailCfg emailCfg = new EmailCfg();
		System.out.println(emailCfg.username);
		
		MailServiceImpl mailServiceImpl = new MailServiceImpl();
		
		mailServiceImpl.sendMail("goog11@lool.io", "9d324a0e27-38839d@inbox.mailtrap.io","Good job!", "Jajaja");
		
		//mailServiceImpl.sendSimpleMail("9d324a0e27-38839d@inbox.mailtrap.io","Good job test2!", "Jajaja");
	}

}
