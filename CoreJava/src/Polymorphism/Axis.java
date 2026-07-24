package Polymorphism;

public class Axis extends Bank {

	@Override
	public String getName() {
		return "Axis Bank";
	}
	@Override
	public double interestRate() {
		return 11.24;
	}
}
