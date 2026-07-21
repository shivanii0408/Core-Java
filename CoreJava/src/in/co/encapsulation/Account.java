package in.co.encapsulation;

public class Account {
	private String number;
	private String AccountType;
	private Double balance;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAccountType() {
		return AccountType;
	}

	public void setAccountType(String AccountType) {
		this.AccountType = AccountType;

	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double Balance) {
		this.balance = Balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("total balance after deposit " + balance);

	}

	public void withdrawal(double wamnt) {
		if (wamnt > balance) {
			System.out.println("insufficent fund transfer");
		} else {
			balance = balance - wamnt;
			System.out.println("total balance after withdrawal:-" + balance);

		}
	}

}
