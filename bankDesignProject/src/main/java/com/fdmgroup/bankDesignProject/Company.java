package com.fdmgroup.bankDesignProject;

import java.util.List;

public class Company extends Customer{

	public Company(String name, String address) {
		super(name, address);
	}

	@Override	
	public void chargeAllAccounts(double amount) {
		List<Account> account=getAccounts();
		for(int i=0;i<account.size();i++) {
			if(account.get(i) instanceof CheckingAccount) {
				account.get(i).balance=account.get(i).balance-amount;
			}else if(account.get(i) instanceof SavingsAccount) {
				account.get(i).balance=account.get(i).balance-(amount*2);
			}
		}
	}

}
