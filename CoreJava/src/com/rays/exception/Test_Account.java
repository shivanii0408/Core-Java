package com.rays.exception;

public class Test_Account {
public static void main(String[] args) {
	Account a=new Account();
	
	a.setBalance(500);
	
	System.out.println("current balance"+a.getBalance());
	
	a.withdraw(1000);
}
}
