package HomeWork;

public class Student {
	private String name;
	private int age;
	private int studentId;
	private static int nextStudentId = 1000;
	
	public Student() {
		this.name = "Unknown";
		this.age = 0;
		this.studentId=generateStudentId();
	}
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
		this.studentId=generateStudentId();
	}

	public Student(String name, int age, int studentId) {
		this.name = name;
		this.age = age;
		this.studentId = studentId;
	}
	private static int generateStudentId() {
        return nextStudentId++;
    }
	public void display()
	{
		System.out.println("Student Details");
		System.out.println("Student Name: "+name);
		System.out.println("Student age: "+age);
		System.out.println("Student ID: "+studentId);
	}
	public static void main(String[] args)
	{
		Student s=new Student();
		Student s1=new Student("Aruna",21);
		Student s2=new Student("Keerthi",21,17);
		s.display();
		System.out.println();
		s1.display();
		System.out.println();
		s2.display();
		
	}

}
