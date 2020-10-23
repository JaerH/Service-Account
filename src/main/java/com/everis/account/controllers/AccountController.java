package com.everis.account.controllers;

import com.everis.account.entities.Account;
import com.everis.account.services.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AccountController {
	
	@Autowired
	private IAccountService iAccountService;
	
	@GetMapping("/core/accounts/{cardNumber}")
	public Account findAccountNumber(@PathVariable String cardNumber) throws InterruptedException {
		return iAccountService.findCardNumber(cardNumber);
	}
	

}
