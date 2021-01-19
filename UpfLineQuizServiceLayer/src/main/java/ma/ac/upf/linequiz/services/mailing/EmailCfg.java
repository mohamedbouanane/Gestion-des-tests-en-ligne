package ma.ac.upf.linequiz.services.mailing;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesScan
//@Configuration
//@ConfigurationProperties("spring.mail")
public class EmailCfg {

    @Value("${spring.mail.username}")
    public String username;

    @Value("${spring.mail.host}")
    private String host;

    @Value("${spring.mail.port}")
    private String port;

    @Value("${spring.mail.password}")
    private String password;
  
    
    public EmailCfg() {
    }
    
    
    public Properties getMailProperties() {
        Properties props = new Properties();
/*
        props.setProperty("mail.transport.protocol", "smtp");
        props.setProperty("mail.smtp.host", "smtp.mailtrap.io");
        props.setProperty("mail.smtp.port", "2525");
        props.setProperty("mail.smtp.user", "066de92fa1bdc0");
        props.setProperty("mail.smtp.password", "e03bc6ef02d807");
        props.setProperty("mail.smtp.starttls.enable", "true");
        props.setProperty("spring.redis.ssl", "false");
        props.setProperty("mail.smtp.auth", "true");
        */

        props.setProperty("mail.transport.protocol", "smtp");
        props.setProperty("mail.smtp.host", host);
        props.setProperty("mail.smtp.port", port);
        props.setProperty("mail.smtp.user", "066de92fa1bdc0");
        props.setProperty("mail.smtp.password", password);
        props.setProperty("mail.smtp.starttls.enable", "true");
        props.setProperty("spring.redis.ssl", "false");
        props.setProperty("mail.smtp.auth", "true");
               
        return props;
    }
}
