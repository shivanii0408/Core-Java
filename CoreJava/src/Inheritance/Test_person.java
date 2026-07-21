package Inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test_person {
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd") ;
		
		Person A = new Person ();
		A.setName("Shivani Gehlot");
		A.setAddress("Indore");
        A.setDateOfBirth(sdf.parse("2004-08-04"));		
		
		System.out.println(A.getName());
		System.out.println(A.getAddress());
		System.out.println(sdf.format(A.getDateOfBirth()));
	}

}