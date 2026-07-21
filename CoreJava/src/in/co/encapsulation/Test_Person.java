package in.co.encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test_Person {
	public static void main(String[] args) throws ParseException {

		Person p = new Person();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		p.setName("Shivani");
		p.setAddress("Indore");
		p.setDob(sdf.parse("2004-08-04"));
		p.setAddress("Indore");
		p.setGender("male");

		System.out.println(p.getName());
		System.out.println(p.getAddress());
		System.out.println(sdf.format(p.getDob()));
		System.out.println(" address:-"+p.getAddress());
		System.out.println(" gender :-"+ p.getGender());
	}
}
