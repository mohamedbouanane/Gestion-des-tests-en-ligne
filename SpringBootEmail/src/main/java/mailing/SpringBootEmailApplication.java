package mailing;

import javax.mail.MessagingException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootEmailApplication {

	public static void main(String[] args) {
		/*SpringApplication.run(SpringBootEmailApplication.class, args);
		
		EmailCfg emailCfg = new EmailCfg();
		System.out.println(emailCfg.username);*/
		
		//EmailCfg
		MailSenderServiceImpl mailServiceImpl = new MailSenderServiceImpl(null);
		
		
		
		try {
			
			//mailServiceImpl.sendSimpleMail("goog11@lool.io", "9d324a0e27-38839d@inbox.mailtrap.io","Good job!", "wiiiiiiiiiii");
			
			//mailServiceImpl.sendAttachmentsMail("goog11@lool.io", "9d324a0e27-38839d@inbox.mailtrap.io","Yeappp!", "doc msg", "C:\\Users\\medbo\\Desktop\\Nouveau dossier\\doc.docx");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//mailServiceImpl.sendSimpleMail("9d324a0e27-38839d@inbox.mailtrap.io","Good job test2!", "Jajaja");
		
	}

}
