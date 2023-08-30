package Collection.student;

public class Teacher {
	private int staffID;
	private String staffName;
	private int experience;
	private double salary;
	
	public Teacher(int staffID, String staffName, int experience, double salary) {
		super();
		this.staffID = staffID;
		this.staffName = staffName;
		this.experience=experience;
		this.salary = salary;
	}
	public int getStaffID() {
		return staffID;
	}
	public void setStaffID(int staffID) {
		this.staffID = staffID;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Teacher [staffID=" + staffID + ", staffName=" + staffName + ", staffExperience=" + experience
				+ ", salary=" + salary + "]";
	}
	
	

}
