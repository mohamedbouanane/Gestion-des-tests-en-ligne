package ma.ac.upf.linequiz.controllers.navigation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NaviagationController {


	@RequestMapping({"/"})
	public String home() {
		return "home";	
	}
	
	// Retourne hiiiii ! si l'URL est /hi
	@RequestMapping({"/hi"})
	public String sayHi() {
		return "hiiiii !";	
	}
	
	@RequestMapping("hello")
	public String helloWorld(@RequestParam(value="name", defaultValue="World") String name) {
		return "Hello "+name+"!!";
	}
	
	/*
	// @ResponseBody ?????????
	@RequestMapping("/")
	public @ResponseBody String home() {
		return "home";	
	}*/
	
}
