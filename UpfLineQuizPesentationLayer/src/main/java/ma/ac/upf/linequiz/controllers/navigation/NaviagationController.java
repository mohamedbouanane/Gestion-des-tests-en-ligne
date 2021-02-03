package ma.ac.upf.linequiz.services.controllers.navigation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NaviagationController {


	@RequestMapping("/")
	public String home() {
		return "home";	
	}
	
	// Retourne hiiiii ! si l'URL est /hi
	@RequestMapping("/hi")
	public String sayHi() {
		return "hiiiii !";	
	}
	
}
