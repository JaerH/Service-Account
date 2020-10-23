package com.everis.account.services;

import com.everis.account.entities.Account;
import org.springframework.stereotype.Service;

@Service
public class IAccountServiceImpl implements IAccountService  {

	
	@Override
	public  Account findCardNumber(String cardNumber) {
		
		Account account = new Account();
		
		try {
			Thread.sleep(5000L);

				if (cardNumber.equals("1111222233334441")) {
					account.setAccountNumber(cardNumber + "xxx");
					account.setAmount(1000);
					
				} else if (cardNumber.equals("1111222233334442")) {
					account.setAccountNumber(cardNumber + "xxx");
					account.setAmount(500);
				
				} else if (cardNumber.equals("1111222233334443")){
					account.setAccountNumber(cardNumber + "xxx");
					account.setAmount(1500);
			
				}
	
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		return account;
	}
	
	
	/*@Override
	public Account findCardNumber(String cardNumber) {
		
		
		Account account = new Account();
			
			if (cardNumber.equals("1111222233334441")) {
				account.setAccountNumber(cardNumber + "xxx");
				account.setAmount(1000);
			} else if (cardNumber.equals("1111222233334442")) {
				account.setAccountNumber(cardNumber + "xxx");
				account.setAmount(500);
			} else if (cardNumber.equals("1111222233334443")) {
				account.setAccountNumber(cardNumber + "xxx");
				account.setAmount(1500);
			}
		

		return account;
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
