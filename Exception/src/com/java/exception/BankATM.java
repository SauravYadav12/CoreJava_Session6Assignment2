package com.java.exception;

public class BankATM {
	int atmId;
	String bankName;
	String location;
	double balance;
	public BankATM(int atmId, String bankName, String location, int balance) {
		super();
		this.atmId = atmId;
		this.bankName = bankName;
		this.location = location;
		this.balance = balance;
	}
	public  void withdraw(double amount ) throws BankATMException{
		
		double newAccountBalance=10000;
		if(balance<newAccountBalance || (balance<10000)){
			throw new BankATMException("Balance is less than 10000. Cannot withdraw");
			
		}
		else{
			newAccountBalance=balance-amount;
			balance=newAccountBalance;
			System.out.println("Balance is "+balance);
			
	}}
	public void deposit(double amount)throws BankATMException {
		double newAccountBalance=10000;
		if(amount<0.0){
			try {
				throw new BankATMException("cannot deposit");
			} catch (BankATMException e) {
				e.printStackTrace();
			}
			
	}else{
		newAccountBalance =balance+amount;
		balance=newAccountBalance;
		
		System.out.println("Available balance is"+balance);
	}

	}
}
