package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Salesperson;
import com.example.demo.services.SalespersonService;

@RestController
@RequestMapping(path="/salespeople")
public class MainController {
	
	@Autowired
	SalespersonService ss;
	
	@GetMapping
	public Iterable<Salesperson> getSalespeople() {
		return ss.getAllSalespeople();
		
	}
	
	@GetMapping(path = "/{sid}")
	public Salesperson getSalesperson(@PathVariable String sid) {
		return ss.getOneSalesperson(sid);
	}
	

}
