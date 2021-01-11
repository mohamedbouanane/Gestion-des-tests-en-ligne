package ma.ac.upf.linequiz.controllers.pagescontrollers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "home";	
	}

}
