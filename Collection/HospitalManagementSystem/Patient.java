package Collection.hospital;

public class Patient {
	private int patientID;
	private String patientName;
	private int age;
	private String gender;
	private String diagnosis;
	
	
	public Patient(int patientID, String patientName, int age, String gender, String diagnosis) {
		this.patientID = patientID;
		this.patientName = patientName;
		this.age = age;
		this.gender = gender;
		this.diagnosis = diagnosis;
	}
	
	public int getPatientID() {
		return patientID;
	}
	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}
	public String getPatietName() {
		return patientName;
	}
	public void setPatietName(String patietName) {
		this.patientName = patietName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	@Override
	public String toString() {
		return "Patient [patientID=" + patientID + ", patientName=" + patientName + ", age=" + age + ", gender=" + gender
				+ ", diagnosis=" + diagnosis + "]";
	}
	
	
	
	

}
