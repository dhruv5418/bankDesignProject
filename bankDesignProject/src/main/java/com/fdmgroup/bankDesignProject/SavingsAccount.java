package com.fdmgroup.bankDesignProject;

public class SavingsAccount extends Account {

	private double interestRate;
	
	public void addInterest() {
		balance=balance+(balance*(interestRate/100));
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double withdraw(double amount) {
		if(amount>balance) {
			return 0;
		}else {
			return super.withdraw(amount);
		}
	}
	
}
