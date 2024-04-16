package org2.NuyenTrongTri.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class MainController {
	@GetMapping("/")
	public String index(Model model) {

		return "index";
	}

}


