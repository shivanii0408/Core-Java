package polymorphism_returntype;

public class Bank {
	public String getName() {
		return "RBI Bank";
	}

	public double interestRate() {
		return 11.0;
	}

	public static Bank getBank(int i) {
		if (i == 1)
			return new HDFC();
		if (i == 2)
			return new ICICI();
		if (i == 3)
			return new Axis();
		return new Bank();
	}

	public double intersetRate() {
		return 11.0;
	}

}
