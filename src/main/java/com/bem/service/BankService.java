package com.bem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RestController;

import com.bem.dao.BankDAO;
import com.bem.pojo.Bank;

@Service
public class BankService {

	@Autowired
	private BankDAO dao;

	public boolean addEmployee(Bank bean) {
		dao.addBank(bean);
		return true;
	}
}
