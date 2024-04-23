package org2.NuyenTrongTri.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	@GetMapping("/")
	public String index() {
		return "index.html";
	}
	@GetMapping("/about")
	public String about() {
		return "about.html";
	}
	@GetMapping("/service")
	public String sevrice() {
		return "service.html";
	}
	@GetMapping("/login")
	public String login() {
		return "login.html";
	}
	
	@GetMapping("/mau")
	public String mau() {
		return "page-mau-HTML.html";
	}
	
	@PostMapping("/login")
    public ModelAndView login(@RequestParam("username") String username,
                              @RequestParam("password") String password) {
        ModelAndView modelAndView = new ModelAndView();
        

        if (username.equals("admin") && password.equals("password")) {

            modelAndView.setViewName("redirect:/");
        } else {

            modelAndView.setViewName("redirect:/login");
        }
        
        return modelAndView;
    }
}