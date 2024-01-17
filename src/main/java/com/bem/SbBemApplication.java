package com.bem;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bem.controller.BEMController;
import com.bem.dao.BankDAO;
import com.bem.pojo.Bank;

@SpringBootApplication
public class SbBemApplication {
	public static void main(String[] args) {
		SpringApplication.run(SbBemApplication.class, args);

	}
}
