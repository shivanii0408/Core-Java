package in.co.abstraction;

public class Test_Businessman {
public static void main(String[] args) {
	Richman r=new Businessman();
	
	r.donation();
	r.earnMoney();
	r.party();
	
	System.out.println("----------");
	
	SocialWorker s=new Businessman();
	
	s.helptoothers();
	
	System.out.println("------------");
	
	Businessman bm = new Businessman();
	
	bm.donation();
	bm.earnMoney();
	bm.helptoothers();
	bm.party();
}
}
