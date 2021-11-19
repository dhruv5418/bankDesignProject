package com.fdmgroup.bankDesignProject;

import java.util.ArrayList;
import java.util.List;

public class AccountController {

	private List<Customer> customers=new ArrayList<Customer>();
	private List<Account> accounts=new ArrayList<Account>();
	
	public Customer createCustomer(String name, String address, String type) {
		if(type.equals("person")) {
			Customer customer=new Person(name, address);
			customers.add(customer);
			return customer;
		}else{
			Customer company=new Company(name, address);
			customers.add(company);
			return company;
		}	
	}
	
	public Account createAccount(Customer customer, String type) {
		if(type.equals("checking")) {
			CheckingAccount checkingAccount=new CheckingAccount();
			accounts.add(checkingAccount);
			customer.addAccount(checkingAccount);
			return checkingAccount;	
		}else {
			SavingsAccount savingsAccount=new SavingsAccount();
			accounts.add(savingsAccount);
			customer.addAccount(savingsAccount);
			return savingsAccount;	
		}
	}
	
	public void removeCustomer(Customer customer) {
		customers.remove(customer);
		for(Account a:customer.getAccounts()) {
			accounts.remove(a);
		}	
	}
	
	public void removeAccount(Account account) {
		accounts.remove(account);
		for(Customer c:customers) {
			c.getAccounts().remove(account);
		}		
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public List<Account> getAccounts() {
		return accounts;
	}
	
}
