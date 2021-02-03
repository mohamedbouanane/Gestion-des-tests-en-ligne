package mailing;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;

import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMultipart;
import javax.mail.PasswordAuthentication;
import javax.mail.internet.InternetAddress;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.mail.MailException;
import org.springframework.stereotype.Component;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.beans.factory.annotation.Autowired;


@Component
public class MailSenderServiceImpl extends Thread /*implements MailSenderService*/ {
    
    @Autowired
    private JavaMailSenderImpl mailSender;
    
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Override
    public void run() {
        try {
        	
            //mailSender.send(mailMessage);
            
            logger.info("A email has been sent. ");           
        } catch (Exception e) {
            logger.error("An exception occurred while sending a email! ", e);
        }
    }
    
    public MailSenderServiceImpl(EmailCfg emailCfg) {
    	
    	mailSender = new JavaMailSenderImpl();
    	
    	mailSender.setHost(emailCfg.getHost());
        mailSender.setPort(emailCfg.getPort());
        mailSender.setUsername(emailCfg.getUsername());
        mailSender.setPassword(emailCfg.getPassword());
        mailSender.setProtocol("smtp");
        mailSender.setDefaultEncoding("UTF-8");
        
        
        // https://www.programcreek.com/java-api-examples/?class=org.springframework.mail.javamail.JavaMailSenderImpl&method=setDefaultEncoding
        
        Properties props = mailSender.getJavaMailProperties();
        
        //props.put("mail.debug", "true");
    	
        // To use TLS
        props.put("mail.smtp.auth", "true"); 
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.port", "2525");
        props.put("mail.smtp.host", "smtp.mailtrap.io");
        /*
        // To use SSL
        props.put("spring.redis.ssl", "false");
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.fallback", "false");
        
        //props.put("mail.smtp.user", config.username);
        props.put("mail.smtp.user", "066de92fa1bdc0");
        props.put("mail.smtp.password", "e03bc6ef02d807");
        props.put("mail.smtp.timeout", "25000");
        */
        /*
        if (sslSupport) {
        	props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        }*/
        
      //Session session = Session.getInstance(props, new Authenticator(config));
        
    }
    
    public void sendSimpleMail(String to, String subject, String content, String... cc) throws MailException {
    	//authentication info
		final String username = "yourUsername@email.com";
		final String password = "password";
		String fromEmail = "fromemail@yahoo.com";
		String toEmail = "toEmail@example.com";
		
		Properties properties = new Properties();
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.mail.yahoo.com");
		properties.put("mail.smtp.port", "587");
		
		Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username,password);
			}
		});
		//Start our mail message
		MimeMessage msg = new MimeMessage(session);
		try {
			msg.setFrom(new InternetAddress(fromEmail));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
			msg.setSubject("Subject Line");
			
			Multipart emailContent = new MimeMultipart();
			
			//Text body part
			MimeBodyPart textBodyPart = new MimeBodyPart();
			textBodyPart.setText("My multipart text");
			
			//Attachment body part.
			MimeBodyPart pdfAttachment = new MimeBodyPart();
			pdfAttachment.attachFile("/home/parallels/Documents/docs/javamail.pdf");
			
			//Attach body parts
			emailContent.addBodyPart(textBodyPart);
			emailContent.addBodyPart(pdfAttachment);
			
			//Attach multipart to message
			msg.setContent(emailContent);
			
			Transport.send(msg);
			System.out.println("Sent message");
			
		} catch (MessagingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    
    //@Override
    public void sendSimpleMail( String from, String to, String subject, String content, String... cc) throws MailException  {
        sendSimpleMail( from, new String[] {to}, subject, content, cc);
    }
    
    //@Override
    public void sendSimpleMail( String from, String[] to, String subject, String content, String... cc) throws MailException  {
    	
    	SimpleMailMessage message = new SimpleMailMessage();
        
    	message.setFrom(from);
    	message.setTo(to);
    	message.setSubject(subject);
    	message.setText(content);
    	
        try {
            mailSender.send(message);
            
            logger.info("A simple email has been sent. ");
            
        } catch (Exception e) {
            logger.error("An exception occurred while sending a simple email! ", e);
        }
    }

    private MimeMessageHelper createMimeMessageHelper(String from, String[] to, String subject, String content, String... cc) {
    	MimeMessage message = mailSender.createMimeMessage();
    	
        try {
        	
        	MimeMessageHelper messageHelper =  new MimeMessageHelper(message, true);
        	messageHelper.setFrom(from);
        	messageHelper.setTo(to);
        	messageHelper.setSubject(subject);
        	messageHelper.setText(content, true);
	        
	        //if (cc.length>0)
	        //	messageHelper.setCc(cc);
			
	        return messageHelper;
	        
		} catch (MessagingException e) {
			e.printStackTrace();
		}

        return null;
    }
    
    //@Override
    public void sendHtmlMail( String from, String to, String subject, String content, String... cc) throws MessagingException {
    	sendHtmlMail( from, new String[] {to}, subject, content, cc);
    }
    
    //@Override
    public void sendHtmlMail(String from, String[] to, String subject, String content, String... cc) throws MessagingException { 
    	MimeMessageHelper mimeMessageHelper = createMimeMessageHelper(from, to, subject, content, cc);
    	if(mimeMessageHelper != null) {
	        MimeMessage message = mimeMessageHelper.getMimeMessage();
	        mailSender.send(message);
    	}
    }
    
    //@Override
    public void sendAttachmentsMail( String from, String to, String subject, String content, String filePath, String... cc) throws MessagingException {
    	sendAttachmentsMail( from, new String[] {to}, subject, filePath, content, cc);
    }
    
    //@Override
    public void sendAttachmentsMail(String from, String[] to, String subject, String content, String filePath, String... cc) throws MessagingException {

        FileSystemResource file = new FileSystemResource(new File(filePath));
        String fileName = filePath.substring(filePath.lastIndexOf(File.separator));
        
        MimeMessageHelper mimeMessageHelper = createMimeMessageHelper(from, to, subject, content, cc);
        if(mimeMessageHelper != null) {
	        mimeMessageHelper.addAttachment(fileName, file);	        
	        MimeMessage message = mimeMessageHelper.getMimeMessage();
	        mailSender.send(message);
        }
    }

    //@Override
    public void sendResourceMail( String from, String to, String subject, String content,  String rscPath, String rscId, String... cc) throws MessagingException {
    	sendResourceMail( from, new String[] {to}, subject, content, rscPath, rscId, cc);
    }
    
    //@Override
    public void sendResourceMail(String from, String[] to, String subject, String content, String rscPath, String rscId, String... cc) throws MessagingException {

        FileSystemResource res = new FileSystemResource(new File(rscPath));
        MimeMessageHelper mimeMessageHelper = createMimeMessageHelper(from, to, subject, content, cc);
        
        if(mimeMessageHelper != null) {
        	mimeMessageHelper.addInline(rscId, res);
            MimeMessage message = mimeMessageHelper.getMimeMessage();    
            mailSender.send(message);
        }
    }
    
}
