package com.hcl.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.model.BankAccount;



@Repository

public class BankAcntDaoImpl implements BankAcntDao{
	
	private SessionFactory sessionFactory;
	
	@Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory=sessionFactory;
    }
    
	@SuppressWarnings("unchecked")
	@Override
	public List<BankAccount> listBankDetails() {
		return sessionFactory.getCurrentSession().createQuery("from BANKACCOUNT b").list();

	}
	
	@SuppressWarnings("unchecked")
	@Override
	public BankAccount getBankByName(String acntName) {		
		Session session= sessionFactory.getCurrentSession();
		List<BankAccount> list = session.createQuery("from BANKACCOUNT b where b.acntName =:ACNT_NAME ")
				.setParameter("ACNT_NAME",acntName).list();
		
		if(list.size()!=0) {
			BankAccount pet=(BankAccount)list.get(0);
            return pet;
            
        }else {
            return null;
        }		
	}

}
