package com.java.exception;

public class Bank {

	public static void main(String[] args) {
		BankATM b1=new BankATM(1010, "IDBI", "Bhopal", 9000);
		BankATM b2=new BankATM(1010, "ICIC", "Delhi", 10000);
		BankATM b3=new BankATM(1010, "HDFC", "Gwalior", 10000);
		try {
			b1.withdraw(3000);
			b1.deposit(2200);
		}catch(Exception e) {
			System.out.println("Exception occurred "+e);
		}
		try {
			b2.withdraw(1200);
			b2.deposit(900);
		}catch(Exception e) {
			System.out.println("Exception occurred "+e);
		}
		try {
			b3.withdraw(15000);
			b3.deposit(1500);
		}catch(Exception e) {
			System.out.println("Exception occurred "+e);
		}
	}
}
