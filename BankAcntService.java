package com.hcl.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hcl.model.BankAccount;


@Service
public interface BankAcntService {
	
	List<BankAccount> listBankDetails();
	
	BankAccount getBankByName(String acntName);

}
