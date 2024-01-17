package com.bem;

import static org.testng.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bem.dao.BankDAO;
import com.bem.pojo.Bank;

@SpringBootTest
class SbBemApplicationTests {

	@Autowired
	static BankDAO dao;
	Bank bean = new Bank(1, "Babu", "S","Cashier",12345, "Mohan123");

	@Test
	void contextLoads() {
	}

	@Test
	public void testPerformInsert() {
		dao = new BankDAO();
		boolean value = dao.addBank(bean);
		assertEquals(value, true);

	}

}
