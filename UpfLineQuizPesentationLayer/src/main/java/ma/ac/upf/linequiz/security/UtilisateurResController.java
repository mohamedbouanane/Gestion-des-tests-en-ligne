package ma.ac.upf.linequiz.security;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import ma.ac.upf.linequiz.dao.entities.UtilisateurEntity;
import ma.ac.upf.linequiz.services.businessservices.UtilisateurService;

@RestController
public class UtilisateurResController {

	@Autowired
	UtilisateurService UtilisateurService;
	
	@PostMapping("user")
	public UtilisateurEntity login(@RequestParam("user") String username, @RequestParam("password") String pwd) {
		
		if(UtilisateurService.checkAccount(username, pwd)) {
			String token = getJWTToken(username);
			UtilisateurEntity user = new UtilisateurEntity();
			user.setLogin(username);
			user.setPassword(pwd);
			user.setToken(token);	
			return user;
		}
		return null;
	}

	private String getJWTToken(String username) {
		String secretKey = "mySecretKey";
		List<GrantedAuthority> grantedAuthorities = AuthorityUtils
				.commaSeparatedStringToAuthorityList("ROLE_USER");
		
		String token = Jwts
				.builder()
				.setId("softtekJWT")
				.setSubject(username)
				.claim("authorities",
						grantedAuthorities.stream()
								.map(GrantedAuthority::getAuthority)
								.collect(Collectors.toList()))
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 600000))
				.signWith(SignatureAlgorithm.HS512,
						secretKey.getBytes()).compact();

		return "Bearer " + token;
	}
}
