package exception.HotelManagement;

public class FrontDeskEmployee extends Employee{

	public FrontDeskEmployee(int employeeID, String employeeName, double salary) {
		super(employeeID, employeeName, salary);
	}
	@Override
	public void performDuties()
	{
		System.out.println(super.getEmployeeName()+ "perform front-desk duties");
	}
	

}
