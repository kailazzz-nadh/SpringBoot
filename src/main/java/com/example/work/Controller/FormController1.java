package com.example.work.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import jakarta.validation.Valid;
import com.example.work.UserDetails;
@Controller
public class FormController1 {
	@GetMapping("/form1")
	 public String processForm(Model model) {
		UserDetails userdetails=new UserDetails();
		model.addAttribute("userdetails",userdetails);
		return "form";
	}
	 @PostMapping("/submit")
	    public String submitForm(@Valid @ModelAttribute("userdetails") UserDetails userDetails, BindingResult result, Model model) {
	        model.addAttribute("userDetails", userDetails);
	        if (result.hasErrors()) {
	            return "form";
	        } else {
	            return "success";
	        }
	    }
	
	

}
