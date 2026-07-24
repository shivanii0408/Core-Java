package Polymorphism;

public class Test_Bank {
	public static void main(String[] args) {
		Bank[] b = new Bank[3];

		b[0] = new Axis();
		b[1] = new HDFC();
		b[2] = new ICICI();

		homeLoanEnquiry(b);
	}
	
public static void homeLoanEnquiry(Bank[] banks) {
	for(int i=0; i<banks.length; i++) {
		System.out.println(banks[i].getName());
		System.out.println(banks[i].interestRate());
		System.out.println("---------");
	}
}
}
