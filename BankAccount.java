package com.hcl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="BANKACCOUNT")
public class BankAccount {
	
	@Id
	@Column(name = "ACNT_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer acntId;
	

	@Column(name="ACNT_NAME")
	private String acntName;
	
	@Column(name="ACNT_AGE")
	private int acntAge;
	
	@Column(name="ACNT_GENDER")
	private char acntGender;
	
	@Column(name="ACNT_BANK")
	private String acntBank;
	@ManyToOne
	@JoinColumn(name="ACNT_CARDNUM")
	private int acntCardNum;
	
	@Column(name="CREDIT_LIMIT")
	private int creditLimit;

	public String getAcntName() {
		return acntName;
	}

	public void setAcntName(String acntName) {
		this.acntName = acntName;
	}

	public int getAcntAge() {
		return acntAge;
	}

	public void setAcntAge(int acntAge) {
		this.acntAge = acntAge;
	}

	public char getAcntGender() {
		return acntGender;
	}

	public void setAcntGender(char acntGender) {
		this.acntGender = acntGender;
	}

	public String getAcntBank() {
		return acntBank;
	}

	public void setAcntBank(String acntBank) {
		this.acntBank = acntBank;
	}

	public int getAcntCardNum() {
		return acntCardNum;
	}

	public void setAcntCardNum(int acntCardNum) {
		this.acntCardNum = acntCardNum;
	}

	
	public Integer getAcntId() {
		return acntId;
	}
	
	public void setAcntId(Integer acntId) {
		this.acntId = acntId;
	}
	
	public int getCreditLimit() {
		return creditLimit;
	}
	
	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}

	public BankAccount() {
		
	}
	
}
