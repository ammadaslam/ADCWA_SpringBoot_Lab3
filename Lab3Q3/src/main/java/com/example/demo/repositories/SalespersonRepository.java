package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Salesperson;

public interface SalespersonRepository extends CrudRepository<Salesperson, String> {

}
