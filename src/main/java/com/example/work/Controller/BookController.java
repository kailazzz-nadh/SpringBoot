package com.example.work.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import com.example.work.Models.book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
@Controller
public class BookController {
	@GetMapping("/homes")
	public String home(Model model) {
		String message="Welcom User to myBooks";
		model.addAttribute("info", message);
		return "info";
	}
	@GetMapping("/books")
	public String books(Model model) {
		book books=new book("Fight Club","Da Vinchi",3000f);
		model.addAttribute("books",books);
		return "books";
	}
	

}
