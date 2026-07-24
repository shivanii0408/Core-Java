package Overriding;

public class TestBank {
	public static void main(String[] args) {

		Bank b1 = new AxisBank();
		System.out.println(b1.getName());
		System.out.println(b1.interestRate());
		System.out.println("-------------");

		Bank b2 = new HDFC();
		System.out.println(b1.getName());
		System.out.println(b1.interestRate());
		System.out.println("-------------");

		Bank b3 = new ICICI();
		System.out.println(b1.getName());
		System.out.println(b1.interestRate());

	}
}
