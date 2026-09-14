package com.example.work.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
@Controller
public class ProjectController {
	@GetMapping("/project")
	public String project(Model model) {
		String message="Welcome to my app";
		model.addAttribute("message",message);
		return "message";
		
	}
	@GetMapping("/item")
	public String product(Model model) {
		String details="This is the ptoduct details page";
		model.addAttribute("details",details);
		return "details";
	}
		
	
	

}
