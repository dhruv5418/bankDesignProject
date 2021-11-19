package com.fdmgroup.bankDesignProject;

import java.util.List;

public class Person extends Customer{

	
	
	public Person(String name, String address) {
		super(name, address);
	}

	
	@Override
	public void chargeAllAccounts(double amount) {
		List<Account> accounts=getAccounts();
		for(int i=0;i<accounts.size();i++) {
			accounts.get(i).balance=accounts.get(i).balance-amount;
		}
	}

}
