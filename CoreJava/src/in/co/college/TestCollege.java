package in.co.college;

public class TestCollege {
public static void main(String[] args) {
	College c = new College();
	c.setCollegeId(121);
	c.setCollegeName("Acropolis");
	c.setUniversity("RGPV");
	c.setContactNo("7489822851");
	
	System.out.println(c.getCollegeId());
	System.out.println(c.getCollegeName());
	System.out.println(c.getUniversity());
	System.out.println(c.getcontactNo());
}
}
