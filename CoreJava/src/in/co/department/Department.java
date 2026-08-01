package in.co.department;

public class Department {
	private int departmentId;
	private String departmentName;
	private String hodName;
	private int totalFaculty;
	private String location;

	public void setdepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public int getdepartmentId() {
		return departmentId;
	}

	public void setdepartmentName(String departmentName) {
		this.departmentName = departmentName;

	}

	public String getdepartmentName() {
		return departmentName;
	}

	public void sethodName(String hodName) {
		this.hodName = hodName;

	}

	public String gethodName() {
		return hodName;
	}

	public void settotalFaculty(int totalFaculty) {
		this.totalFaculty = totalFaculty;
	}

	public int gettotalFaculty() {
		return totalFaculty;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public String  getLocation() {
		return location;
	}

}
