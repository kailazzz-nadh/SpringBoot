package com.example.work.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
@Controller

public class MovieController {
	@GetMapping("/movie")
	public String movie(Model model) {
		String text="FightClub";
		model.addAttribute("text",text);
		String start="Fight Club is a 1999 American film directed by David Fincher and starring Brad Pitt, Edward Norton, and Helena Bonham Carter.....";
		model.addAttribute("start",start);
		boolean isLoggedIn = false;
		model.addAttribute("isLoggedIn",isLoggedIn);
		return "movie";
		
	}

}
