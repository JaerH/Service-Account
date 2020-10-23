package com.everis.account.services;

import com.everis.account.entities.Account;

public interface IAccountService {
	
	public Account findCardNumber(String cardNumber);
}
