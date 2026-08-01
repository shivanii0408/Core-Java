package polymorphism_returntype;

public class ICICI extends Bank {

	@Override
	public String getName() {
		return "HDFC Bank";
	}

	@Override
	public double interestRate() {
		return 11.24;
	}
}
