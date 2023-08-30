package Collection.employee;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Employee> al=new ArrayList<>();
		while(true)
		{
			System.out.println("Employee Management System \n 1. Adding Employees \n 2. View employee details \n 3. Search employee by ID \n 4. exit");
			System.out.println("Enter your option: ");
			int option=sc.nextInt();
			if(option==1)
			{
				System.out.println("Enter Employee ID : ");
				int employeeID=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Employee Name: ");
				String employeeName=sc.nextLine();
				System.out.println("Enter salary: ");
				double salary=sc.nextDouble();
				Employee e=new Employee(employeeID,employeeName,salary);
				al.add(e);
				System.out.println("Employee details added successfully");
			}
			else if(option==2)
			{
				for(Employee emp:al) {
					System.out.println(emp.toString());
				}
				
			}
			else if(option==3)
			{
				System.out.println("Enter the employee ID to be search");
				int id=sc.nextInt();
				boolean found=false;
				for(Employee emp:al)
				{
					if(emp.getEmployeeID()==id)
					{
						System.out.println("Employee Found "+ emp.toString());
						found=true;
					}
				}
				if(!found)
				{
					System.out.println("There is no employee in the ID "+ id );
				}
			}
			else if(option==4)
			{
				System.out.println("Exit");
				sc.close();
				System.exit(0);
			}
			else
			{
				System.out.println("Invalid option. Please choose the correct option");
			}
		}
		
		
		
	}

}
