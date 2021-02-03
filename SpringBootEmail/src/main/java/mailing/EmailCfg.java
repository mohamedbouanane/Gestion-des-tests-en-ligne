package mailing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.stereotype.Component;

@Component
//@ConfigurationPropertiesScan
//@Configuration
//@ConfigurationProperties("spring.mail")
public class EmailCfg {
	
    @Value("${spring.mail.username}")
    private String username;

    @Value("${spring.mail.host}")
    private String host;

    @Value("${spring.mail.port}")
    private int port;

    @Value("${spring.mail.password}")
    private String password;
  
    
    public EmailCfg() {
    	
    	
    	
    	username = "066de92fa1bdc0";
    	host = "smtp.mailtrap.io";
    	port = 2525;
    	password = "e03bc6ef02d807";
    	
    }

    
    public String getUsername() { return username; }

	public String getHost() { return host; }

	public int getPort() { return port; }

	public String getPassword() { return password; }

}
