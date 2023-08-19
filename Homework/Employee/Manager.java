package HomeWork.Employee;

public class Manager extends Employee{
	private String department;
	
	public Manager(int employeeId, String name, String department) {
		super(employeeId, name);
		this.department = department;
	}
	public void display()
	{
		System.out.println("Manager Details");
		super.display();
		System.out.println("Department: "+department);
	}
	

}
