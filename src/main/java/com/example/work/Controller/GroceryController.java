package com.example.work.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.work.Models.Product;
import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
@Controller
public class GroceryController {
	@GetMapping("/product")
	public String product(Model model) {
		List <Product>products=new ArrayList<>();
		 products.add(new Product(101, "Sugar",55.5f));
		 products.add(new Product(102, "Salt",20f));
		 products.add(new Product(103, "Wheatflour",38.75f));
		 model.addAttribute("products", products);
		 return "products";
		 
		
	}
	@GetMapping("/grocery")
	public String grocery(Model model) {
		List <Product>grocery=new ArrayList<>();
		 grocery.add(new Product(101, "Sugar",55.5f));
		 grocery.add(new Product(102, "Salt",20f));
		 grocery.add(new Product(103, "Wheatflour",38.75f));
		 model.addAttribute("grocery", grocery);
		 return "grocery";
		 
		
	}
}