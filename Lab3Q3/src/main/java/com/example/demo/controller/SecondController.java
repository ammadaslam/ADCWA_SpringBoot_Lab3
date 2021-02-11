package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Salesperson;
import com.example.demo.services.SalespersonService;

@RestController

@RequestMapping(path = "/newSalesPerson")

public class SecondController {
	
	@Autowired
	SalespersonService ss;
	
	@PostMapping
	public void newSalesPerson() {
		Salesperson sp = new Salesperson("S107", "John", "Smith", "1970-12-01", "New York",3.2f);
		ss.save(sp);
		
	}

}
