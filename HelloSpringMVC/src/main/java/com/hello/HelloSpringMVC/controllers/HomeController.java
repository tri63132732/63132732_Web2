package com.hello.HelloSpringMVC.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.ModelMap;

@Controller
public class HomeController {
	@GetMapping("/")
	public String goHome(ModelMap model) {
		model.addAttribute("tb","Hello good afternoon");
		return "sayhello";
	}
}
