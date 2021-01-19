package ma.ac.upf.linequiz.services.mailing;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.Authenticator;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.PasswordAuthentication;

import javax.mail.internet.MimeMessage;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMultipart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

@Component
public class MailServiceImpl implements MailService {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
    @Autowired
    private JavaMailSender mailSender;
      
    @Autowired
    EmailCfg emailCfg;
    
    public void sendMail(String from, String to, String subject, String msgBody) {
    	
    	emailCfg = new EmailCfg();
    	
        Properties props = emailCfg.getMailProperties();
        
        Session mailSession = Session.getInstance(props, new javax.mail.Authenticator(){
            protected PasswordAuthentication getPasswordAuthentication() {
                //return new PasswordAuthentication("your_email", "your_password");
            	return new PasswordAuthentication("066de92fa1bdc0", "e03bc6ef02d807");
            }
        });

        mailSession.setDebug(false);

        try {
            Transport transport = mailSession.getTransport();

            MimeMessage message = new MimeMessage(mailSession);
            message.setSubject(subject);
            message.setFrom(new InternetAddress(from));
            message.addRecipients(Message.RecipientType.TO, to);

            MimeMultipart multipart = new MimeMultipart();

            MimeBodyPart messageBodyPart = new MimeBodyPart();

            messageBodyPart.setContent(msgBody, "text/html");

            multipart.addBodyPart(messageBodyPart);
            message.setContent(multipart);

            transport.connect();
            transport.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
            transport.close();
            logger.info("A simple email has been sent. ");
            
        } catch (NoSuchProviderException e) {
        	logger.error("Invalid email! ", e);
            //e.printStackTrace();
        } catch (MessagingException e) {
        	logger.error("An exception occurred while sending a simple email! ", e);
        }
    }
    

    public boolean send(String to, String from, String subject, String text) {
        return send(new String[] {to}, from, subject, text);
    }

    public boolean send(String[] to, String from, String subject, String text) {

    	JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
    	
        Properties props = mailSender.getJavaMailProperties();
        
        //props.put("mail.debug", "true");
    	
        //To use TLS
        props.put("mail.smtp.auth", "true"); 
        props.put("mail.smtp.starttls.enable", "true");

        //To use SSL
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");
        props.put("mail.smtp.host", "");
        //props.put("mail.smtp.user", config.username);
        props.put("mail.smtp.password", "password");

        //Transport.send(message);
        
        //Session session = Session.getInstance(props, new Authenticator(config));
/*
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            InternetAddress[] addressTo = new InternetAddress[to.length];
            for (int i = 0; i < to.length; i++) {
                addressTo[i] = new InternetAddress(to[i]);
            }
            message.setRecipients(Message.RecipientType.TO, addressTo);
            message.setSubject(subject);
            message.setText(text);
            Transport.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
            return false;
        }*/
        return true;
    	
    }
    
    
    @Override
    public void sendSimpleMail(String to, String subject, String content, String... cc) {
    	
        /*
        // Create a mail sender
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost(host);
        mailSender.setPort(port);
        mailSender.setUsername(from);
        mailSender.setPassword(password);
    	
        Properties props = mailSender.getJavaMailProperties();
        //props.put("mail.transport.protocol", "smtp");
        //props.put("mail.debug", "true");
    	
        //To use TLS
        props.put("mail.smtp.auth", "true"); 
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.password", "password");
        
        //To use SSL
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");
        
    	SimpleMailMessage mailMessage = new SimpleMailMessage();
    	
    	
        mailMessage.setFrom(from);
        mailMessage.setTo(to);
        mailMessage.setSubject(subject);
        mailMessage.setText(content);
        
        //mailMessage.set
        //if (ArrayUtil.isNotEmpty(cc))
        //    mailMessage.setCc(cc);
        
        try {
            mailSender.send(mailMessage);
            logger.info("A simple email has been sent. ");
        } catch (Exception e) {
            logger.error("An exception occurred while sending a simple email! ", e);
        }*/
    }

    @Override
    public void sendHtmlMail(String to, String subject, String content, String... cc) throws MessagingException {
    	/*
        MimeMessage message = mailSender.createMimeMessage();
        
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setFrom(from);
        helper.setTo(to);
        helper.setSubject(subject);
        helper.setText(content, true);
        
        //if (ArrayUtil.isNotEmpty(cc))
        //    helper.setCc(cc);
        
        mailSender.send(message);*/
    }

    @Override
    public void sendAttachmentsMail(String to, String subject, String content, String filePath, String... cc) throws MessagingException {
        /*
    	MimeMessage message = mailSender.createMimeMessage();

        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setFrom(from);
        helper.setTo(to);
        helper.setSubject(subject);
        helper.setText(content, true);
        
        //if (ArrayUtil.isNotEmpty(cc))
        //    helper.setCc(cc);
        
        FileSystemResource file = new FileSystemResource(new File(filePath));
        String fileName = filePath.substring(filePath.lastIndexOf(File.separator));
        helper.addAttachment(fileName, file);

        mailSender.send(message);*/
    }

    @Override
    public void sendResourceMail(String to, String subject, String content, String rscPath, String rscId, String... cc) throws MessagingException {
        /*
    	MimeMessage message = mailSender.createMimeMessage();

        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setFrom(from);
        helper.setTo(to);
        helper.setSubject(subject);
        helper.setText(content, true);
        
        //if (ArrayUtil.isNotEmpty(cc))
        //    helper.setCc(cc);
        
        FileSystemResource res = new FileSystemResource(new File(rscPath));
        helper.addInline(rscId, res);

        mailSender.send(message);*/
    }
    
}
