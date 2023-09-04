package exception.HotelManagement;

public class KitchenStaffEmployee extends Employee{

	public KitchenStaffEmployee(int employeeID, String employeeName, double salary) {
		super(employeeID, employeeName, salary);
	}
	@Override
	public void performDuties() {
		System.out.println(super.getEmployeeName()+ "works in kitchen.");
	}
}
