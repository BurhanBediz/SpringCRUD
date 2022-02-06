package springbootCrud.controller;

import org.springframework.stereotype.Controller;

@Controller
public class HomeContoller {
	
	public String home() {
		
		return "index.html";
	}

}
