package ma.ac.upf.linequiz.controllers.pagescontrollers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

	// @ResponseBody ?????????
	@RequestMapping("/")
	public @ResponseBody String home() {
		return "home";	
	}

}
