package com.example.work.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
	@GetMapping("/form")
	public String process(){
		return "username";
	}
	  @GetMapping("/result")
	    public String requestForm (@RequestParam String username,Model model) {

	        model.addAttribute("username", username);
	        model.addAttribute("formData", "username=" + username);

	        return "result";
	    }
	
	
	

}
