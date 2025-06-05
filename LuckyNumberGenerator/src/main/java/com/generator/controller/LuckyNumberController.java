package com.generator.controller;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generator.model.LuckyModel;
import com.generator.service.LuckService;

@Controller
public class LuckyNumberController {

	// Constructor injection
	private LuckService luckServicel;

	@Autowired
	public void setLuckServicel(LuckService luckServicel) {
		this.luckServicel = luckServicel;
	}

	@GetMapping("/mainpage")
	public String getHome() {
		
		// MAIN PAGE RETURN WITH BUTTORN
		return "home";

	}

	@GetMapping("/getquotes")
	public String getQuotes(Model model) throws FileNotFoundException, IOException {
		
		// CALLING SERIVICE AND GETTING REPOND FROM SERVICE AND ADDING TO MODEL
		model.addAttribute("numbers", luckServicel.getNumber());
		return "numberpage";

	}

}
