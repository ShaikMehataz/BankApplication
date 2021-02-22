package com.hcl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="BANKTRANSACTION")
public class BankTransaction {
	
	@Column(name="ACNT_CARDNUM")
	private int acntCardNum;
	
	@Column(name="ACNT_TDATE")
	private String acntTdate;
	
	@Column(name="ACNT_AMOUNT")
	private int acntAmount;

	public int getAcntCardNum() {
		return acntCardNum;
	}

	public void setAcntCardNum(int acntCardNum) {
		this.acntCardNum = acntCardNum;
	}

	public String getAcntTdate() {
		return acntTdate;
	}

	public void setAcntTdate(String acntTdate) {
		this.acntTdate = acntTdate;
	}

	public int getAcntAmount() {
		return acntAmount;
	}

	public void setAcntAmount(int acntAmount) {
		this.acntAmount = acntAmount;
	}

	public BankTransaction() {
		
		
	}
	
	
	
}
