package Test1;

public class Student {
		private int studentId;
		private String name;
		private static int totalStudents=100;
		public Student(int studentId, String name) {
			this.studentId = studentId;
			this.name = name;
			totalStudents++;
		}
		public void enroll()
		{
			System.out.println("No of Strudents after enrollment: "+totalStudents+" "+name+ " " +studentId);
		}
		public void drop()
		{
			totalStudents--;
			System.out.println("No of Strudents after drop: "+totalStudents+" "+name+ " " +studentId);
		}
	public static void main(String[] args) {
		Student s=new Student(001,"Keerthi");
		s.enroll();
		Student s1=new Student(002,"Aruna");
		s1.enroll();
		Student s2=new Student(003,"Sree");
		s2.enroll();
		s.drop();
	}

}
