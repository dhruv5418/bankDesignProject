package com.fdmgroup.bankDesignProject;

import java.util.ArrayList;
import java.util.List;

public class AccountController {

	private List<Customer> customers=new ArrayList<Customer>();
	private List<Account> accounts=new ArrayList<Account>();
	
	public Customer createCustomer(String name, String address, String type) {
		if(type.equals("person")) {
			Person person=new Person(name, address);
			customers.add(person);
			return	person;
		}else{
			Company company=new Company(name, address);
			customers.add(company);
			return company;
		}
		
	}
	
	public Account createAccount(Customer customer, String type) {
		if(type.equals("checking")) {
			Account account=new CheckingAccount();
			accounts.add(account);
			customer.addAccount(account);
			return account;	
		}else {
			Account account=new SavingsAccount();
			accounts.add(account);
			customer.addAccount(account);
			return account;	
		}
	}
	
	public void removeCustomer(Customer customer) {
		
		customers.remove(customer);
		
		
	}
	
	public void removeAccount(Account account) {
		accounts.remove(account);
		
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public List<Account> getAccounts() {
		return accounts;
	}
	
}
