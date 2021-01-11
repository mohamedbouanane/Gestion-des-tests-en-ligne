package ma.ac.upf.linequiz.controllers.entiyscontrollers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/Utilisateur") // API >>Important>> https://www.youtube.com/watch?v=2JPJ1OOVT3E
public class UtilisateurController {

	@RequestMapping("/user")
	public String user() {
		return "home";	
	}
	
	@RequestMapping("/admin")
	public String admin() {
		return "home";	
	}
}
