package Polymorphism;

public class ICICI extends Bank {

	@Override
	public String getName() {
		return "ICICI Bank";
	}
	@Override
	public double interestRate() {
		return 12.0;
	}
}

