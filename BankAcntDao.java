package com.hcl.dao;

import java.util.List;

import com.hcl.model.BankAccount;




public interface BankAcntDao {
	
	List<BankAccount> listBankDetails();
	
	BankAccount getBankByName(String acntName);
	
	


}
