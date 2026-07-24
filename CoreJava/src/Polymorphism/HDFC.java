package Polymorphism;

public class HDFC extends Bank {

	@Override
	public String getName() {
		return "HDFC Bank";
	}
	@Override
	public double interestRate() {
		return 12.0;
	}
}
