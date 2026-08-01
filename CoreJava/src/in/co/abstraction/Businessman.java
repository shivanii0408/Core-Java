package in.co.abstraction;

public class Businessman extends Person implements Richman , SocialWorker{

	@Override
	public void helptoothers() {
		System.out.println("helpToOthers");
	}
	@Override
	public void earnMoney() {
		System.out.println("earnMoney");
	}
	@Override
	public void donation() {
		System.out.println("donation");
	}
	@Override
	public void party() {
		System.out.println("party");
	}
	
}
