package com.hcl.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dao.BankAcntDao;
import com.hcl.model.BankAccount;



@Service
public class BankAcntServiceImpl implements BankAcntService{
	
	BankAcntDao bankDao;

	 @Autowired(required=true)
	    public void setBankAcntDao( BankAcntDao bankDao) {
	        this.bankDao=bankDao;
	    }

	@Transactional
	public List<BankAccount> listBankDetails(){
		return bankDao.listBankDetails() ;
	}
	
	@Transactional
	public BankAccount getBankByName(String acntName) {
		return bankDao.getBankByName(acntName);
	}

}
