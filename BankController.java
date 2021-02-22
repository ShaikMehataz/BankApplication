package com.hcl.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.model.BankAccount;

import com.hcl.service.BankAcntService;



@Controller

public class BankController {
	
private  BankAcntService bankService;
	
	@Autowired(required = true)
	public void setBankAcntService(BankAcntService bankService) {
		this.bankService = bankService;
	}
	
	//list all pets in welcome page
	@RequestMapping("listBankDetails")
	public ModelAndView bankAccountAvailable() {
		ModelAndView model = new ModelAndView();
		model.addObject("bank", new BankAccount());// for book entry form model mapping
		model.addObject("bankList", bankService.listBankDetails() );// to display the book table data below the form
		System.out.println("All details are listed");
		model.setViewName("welcome");// jsp page
		return model;
	}
	
	@RequestMapping("/getDetails/{acntName}")
	public ModelAndView displayDetailsByName(@PathVariable("acntName") String acntName, Map<String, Object> map) {
		ModelAndView model = new ModelAndView();
		
		model.addObject("bank", new BankAccount());// for pet entry form model mapping
		map.put("bankList", bankService.getBankByName(acntName)); // to display the pet table data of selected id

		System.out.println("Details selected with given name: "+acntName);
		model.setViewName("view");// jsp page
		return model;
	}

}
