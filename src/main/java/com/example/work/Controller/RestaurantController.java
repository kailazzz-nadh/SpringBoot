

package com.example.work.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.work.Models.Restaurant;

@Controller
public class RestaurantController {

    @GetMapping("/dish/{name}/{price}")
    public String showDish(@PathVariable String name,@PathVariable float price,Model model) {

    	 Restaurant product = new Restaurant();
    	   product.setName(name);
    	   product.setPrice(price);
    	   model.addAttribute("product", product);
    	   return "dish";
    }
}
