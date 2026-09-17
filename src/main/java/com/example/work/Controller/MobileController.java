package com.example.work.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.work.Models.MobilePhone;
import com.example.work.Repository.PhoneRepository;
@Controller

public class MobileController {
	@Autowired
	private PhoneRepository phoneRepository;
	@GetMapping("/phoneform")
	public String phonefor(Model model){
		 model.addAttribute("phone", new MobilePhone());
	        return "phoneform";
	    
	}
	@PostMapping("/savephone")
	public String savephone(MobilePhone phone) {
		MobilePhone c=new MobilePhone();
		c.setPhonename(phone.getPhonename());
		c.setBrand(phone.getBrand());
		c.setPrice(phone.getPrice());
		c.setType(phone.getType());
		phoneRepository.save(c);
		return "redirect:/phones";
		
	}
	@GetMapping("phones")
	 public String showPhones(Model model) {
        model.addAttribute("phoneList",phoneRepository.findNamesAndPrices());
        model.addAttribute("cheapPhones",phoneRepository.findByMaxPrice());
        model.addAttribute("phoneCountByType", phoneRepository.findPhoneCountByType());
        return "phones";

	}
	
	

}
