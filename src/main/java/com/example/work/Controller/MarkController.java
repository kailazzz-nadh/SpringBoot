package com.example.work.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.work.Models.Student;
import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
@Controller
public class MarkController {
	@GetMapping("/score")
public String score(Model model) {
		List<Student>pupil=new ArrayList<>();
		pupil.add(new Student(101,"AnjaliSharma",92.5f));
		pupil.add(new Student(102,"RohitMehta",85f));
		pupil.add(new Student(103,"SnehaIyer",78.6f));
		model.addAttribute("class",pupil);
		return "class";
	}
	@GetMapping("/grade")
	public String grade(Model model) {
		List<Student>gang=new ArrayList<>();
		gang.add(new Student(101,"AnjaliSharma",92.5f));
		gang.add(new Student(102,"RohitMehta",85f));
		gang.add(new Student(103,"SnehaIyer",78.6f));
		model.addAttribute("standard",gang);
		return "standard";
		
	}
	

}
