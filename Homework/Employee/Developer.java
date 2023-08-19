package HomeWork.Employee;

public class Developer extends Employee{
	private String programmingLang;

	public Developer(int employeeId, String name, String programmingLang) {
		super(employeeId, name);
		this.programmingLang = programmingLang;
	}
	public void display()
	{
		System.out.println("Developer Details");
		super.display();
		System.out.println("Programming Language: "+programmingLang);
	}
}
