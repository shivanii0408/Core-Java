package Constructor;

public class Account {
	public String AccNumber;
	public String AccType;
	public double balance;

	public Account() {
		System.out.println("This is Default Constructor");
	}

	public Account(String AccNumber, String AccType, double balance) {
		this.AccNumber = AccNumber;
		this.AccType = AccType;
		this.balance = balance;
		System.out.println(this.AccNumber);
		System.out.println(this.AccType);
		System.out.println(this.balance);
	}

}
