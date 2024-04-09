package org.o7planning.thymeleaf.Controllers;

import java.util.List;

import org.o7planning.thymeleaf.Models.Customer;
import org.o7planning.thymeleaf.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired CustomerService customerService;
	@GetMapping("/all")
	public String getAll(Model model) {
		List<Customer> dsKH = customerService.findAllCustomer();
		model.addAttribute("dsKhachHang", dsKH);
		return "danhsachKH";
	}
}