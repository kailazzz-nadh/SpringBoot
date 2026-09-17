package com.example.work.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.work.Repository.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.example.work.Models.ProductModel; 
@Controller
public class ProductController {
	@GetMapping("/product11")
	public String product(Model model) {
		  model.addAttribute("message", "Enter Your product Details");
		    return "product";
		
	}
	private  ProductRepository productRepository;
	public ProductController(ProductRepository productRepository) {
		
		this.productRepository=productRepository;
	}
	@PostMapping("/save-product")
	public String Product(ProductModel productData,Model model) {
	    
	    ProductModel n = new ProductModel();
	    n.setName(productData.getName());
	    n.setDescription(productData.getDescription());    
	    n.setPrice(productData.getPrice()); 
	    productRepository.save(n);
	    
	    model.addAttribute("message", "The product " + productData.getName() +" is saved successfully");
	    return "product"; 
	} 
	
	
	

}
