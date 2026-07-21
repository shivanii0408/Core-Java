package in.co.encapsulation;

import java.util.Date;

public class Person {

	private String name;
	private Date dob;
	private String address;
	private String gender;
	public final static int AVG_AGE = 18;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getDob() {
		return dob;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public int getAge(Date dob) {
		Date dd = new Date();

		int age = dd.getYear() - dob.getYear();

		return age;

}
}
