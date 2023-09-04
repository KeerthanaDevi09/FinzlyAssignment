package exception.HotelManagement;

public class HouseKeepingEmployee extends Employee{

	public HouseKeepingEmployee(int employeeID, String employeeName, double salary) {
		super(employeeID, employeeName, salary);
	}

	@Override
	public void performDuties() {
		System.out.println(super.getEmployeeName()+ "perform house keeping duties.");
	}
	

}
