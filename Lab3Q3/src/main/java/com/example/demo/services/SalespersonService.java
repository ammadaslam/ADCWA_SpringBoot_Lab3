package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Salesperson;
import com.example.demo.repositories.SalespersonRepository;

@Service
public class SalespersonService {
	
	@Autowired
	SalespersonRepository sr;
	
	//method
	public Iterable<Salesperson> getAllSalespeople() {
		return sr.findAll();
		
	}
	public Salesperson getOneSalesperson(String sid) {
		Optional<Salesperson> sp = sr.findById(sid);
		if (sp.isPresent()) {
			sp.get().setCommission(1 + sp.get().getCommission());
			return sp.get();
		}else {
			return null;
		}
	}
	public void save(Salesperson sp) {
		sr.save(sp);
	}

}
