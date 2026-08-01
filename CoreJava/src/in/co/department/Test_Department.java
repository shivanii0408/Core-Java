package in.co.department;

public class Test_Department {
public static void main(String[] args) {
	Department d=new Department();
	d.setdepartmentId(120);
	d.setdepartmentName("CSIT");
	d.setLocation("Indore");
	d.settotalFaculty(15);
	d.sethodName("Shivani");
	
	System.out.println(d.getdepartmentId());
	System.out.println(d.getdepartmentName());
	System.out.println(d.gethodName());
	System.out.println(d.getLocation());
	System.out.println(d.gettotalFaculty());
}
}
