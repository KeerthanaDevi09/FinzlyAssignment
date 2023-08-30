package Collection.student;

public class Student {
	private int studentID;
	private String studentName;
	private String extraCurricular;
	private int age;
	
	public Student(int studentID, String studentName, String extraCurricular, int age) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.extraCurricular = extraCurricular;
		this.age = age;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getExtraCurricular() {
		return extraCurricular;
	}
	public void setExtraCurricular(String extraCurricular) {
		this.extraCurricular = extraCurricular;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", extraCurricular="
				+ extraCurricular + ", age=" + age + "]";
	}
	
	
	
	
	
	

}
