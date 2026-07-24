package Overriding;

public class Test_person2 {
	public static void main(String[] args) {
		
	
	Person p1 = new Doctor();//Reference 
	Doctor d = (Doctor) p1;
	
	
	d.setAge(22);
	d.setName("Shivani");
	d.setRegno("29");
	
	

	}
}
