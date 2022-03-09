package com.br.softwareproject.softwareprofect.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.br.softwareproject.softwareprofect.model.UserModel;

@Controller
public class UserController {
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
	@GetMapping("/usuario")
	public String userForm (Model model) {
		model.addAttribute("user", new UserModel());
		
		return "userform";
	}
	
	@PostMapping("/register")
	public String report (@ModelAttribute UserModel user) {
		return "report";
	}
}
