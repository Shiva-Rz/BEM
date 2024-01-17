package com.bem.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.bem.pojo.Bank;

@Repository
public class BankDAO {
	
	List<Bank> Bankdetail=new ArrayList<Bank>();
	public boolean addBank(Bank bean) {
		
		Bankdetail.add(bean);
		return true;
	}
}

