package com.bem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bem.dao.BankDAO;
import com.bem.pojo.Bank;
import com.bem.service.BankService;

@RestController
@CrossOrigin(origins = "http://localhost:2000")
@RequestMapping("/bankingRest/api")
public class BEMController {
	
	@Autowired
	BankService service;
	
	@PostMapping("/products")
	public boolean performInsert(@RequestBody Bank bean) {
		return service.addEmployee(bean);
	}
}
