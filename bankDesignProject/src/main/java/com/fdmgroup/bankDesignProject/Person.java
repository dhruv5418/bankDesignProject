package com.fdmgroup.bankDesignProject;

import java.util.List;

public class Person extends Customer{

	
	
	public Person(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void chargeAllAccounts() {
		// TODO Auto-generated method stub	
	}
	
	public void chargeAllAccounts(double amount) {
		// TODO Auto-generated method stub
		List<Account> accounts=getAccounts();
		for(int i=0;i<accounts.size();i++) {
			accounts.get(i).balance=accounts.get(i).balance-amount;
		}
	}

}
