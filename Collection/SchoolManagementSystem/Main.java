package Collection.student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Student> s=new ArrayList<>();
		ArrayList<Teacher> t=new ArrayList<>();
		while(true)
		{
			System.out.println("School Management System \n 1. Add Student \n 2. Add Teacher \n 3. View Student details \n 4. View Teacher details \n 5.exit");
			System.out.println("Enetr the option: ");
			int option=sc.nextInt();
			if(option==1)
			{
				int studentID=s.size()+1;
				sc.nextLine();
				System.out.println("Enetr student name: ");
				String studentName=sc.nextLine();
				System.out.println("Extra Curricular Activity: ");
				String extraCurricular=sc.nextLine();
				System.out.println("Enter Student age: ");
				int studentAge=sc.nextInt();
				Student st=new Student(studentID,studentName,extraCurricular,studentAge);
				s.add(st);
				System.out.println("Student Details Added Successfully");
			}
			else if(option==2)
			{
				int staffID=s.size()+1;
				sc.nextLine();
				System.out.println("Enetr staff name: ");
				String staffName=sc.nextLine();
				System.out.println("Enter Staff experience(in years): ");
				int experience=sc.nextInt();
				System.out.println("Enter Staff salary: ");
				int staffSalary=sc.nextInt();
				Teacher te=new Teacher(staffID,staffName,experience,staffSalary);
				t.add(te);
				System.out.println("Staff Details Added Successfully");
			}
			else if(option==3)
			{
				for(Student stud:s)
				{
					System.out.println(stud.toString());
				}
			}
			else if(option==4)
			{
				for(Teacher tech:t)
				{
					System.out.println(tech.toString());
				}
			}
			else if(option==5)
			{
				System.out.println("Exit");
				sc.close();
				System.exit(0);
			}
			else
			{
				System.out.println("Invalid option. Please enter a valid option");
			}
		}
	}

}
