package polymorphism_returntype;

public class TestMethod_Returntype {
public static void main(String[] args) {
	Bank[] banks=new Bank[3];
	
	banks[0]=Bank.getBank(1);
	banks[1]=Bank.getBank(2);
	banks[2]=Bank.getBank(3);
	
	homeLoanEnquiry(banks);
	
	public static void homeLoanEnquiry(Bank[] banks) {
		for (int i = 0; i < banks.length; i++) {
			System.out.println(banks[i].getName());
			System.out.println(banks[i].interestRate());
			System.out.println("-------------------");
		}
}
}
