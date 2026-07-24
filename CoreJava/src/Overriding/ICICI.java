package Overriding;

public class ICICI extends Bank {
	@Override
	public String getName() {
		return "ICICI Bank";
	}
	@Override
	public double interestRate() {
		return 11.40;
	}
}
