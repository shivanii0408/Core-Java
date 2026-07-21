package in.co.encapsulation;

public class TestAccount {
	
	public static void main(String[] args) {
		
		Account a = new Account();
		
		a.setNumber("121");
		a.setAccountType("Savings");
		a.setBalance(100.0);
		
		
		System.out.println(a.getNumber());
		System.out.println(a.getAccountType());
		System.out.println(a.getBalance());

		a.deposit(500.00);
		a.withdrawal(230.00);
	}
}
