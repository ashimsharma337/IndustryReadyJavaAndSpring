package com.ashim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
@RequestMapping
public class EmployeeController {
	
//	@Autowired
//	private IEmployeeRepo repo;
//	
//	public List<Employee> getAllEmployees(){
//	
//	return null;
//
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("name", "Ashim");
		model.addAttribute("position", "Manager");
		model.addAttribute("salary", 30000);
		
		return "index";
	}
	
	@GetMapping("/add")
	public String getEmployee(Model model) {
		return "add-employee";
	}
	
	
	

}
