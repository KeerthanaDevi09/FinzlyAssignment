package exception.HotelManagement;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EmployeeManagement {
	private Map<String,List<Employee>> empCategory = new HashMap<>();
	private int employeeIdCounter=1;
	
	public Employee hireEmployee(String category,String name,double salary) throws DuplicateEmployeeException
	{
		category = category.toLowerCase();
		Employee newEmployee;
		switch(category)
		{
		case "front desk":
			newEmployee= new FrontDeskEmployee(employeeIdCounter++,name,salary);
			break;
		case "house keeping":
			newEmployee= new HouseKeepingEmployee(employeeIdCounter++,name,salary);
			break;
		case "kitchen staff":
			newEmployee= new KitchenStaffEmployee(employeeIdCounter++,name,salary);
			break;
		case "maintenance":
			newEmployee= new MaintenanceEmployee(employeeIdCounter++,name,salary);
			break;
		default:
			throw new IllegalArgumentException("Invalid Employee Category.");		
		}
		// Check for duplicate employees
        if (empCategory.containsKey(category.toLowerCase())) {
            for (Employee employee : empCategory.get(category)) {
                if (employee.getEmployeeName().equalsIgnoreCase(name)) {
                    throw new DuplicateEmployeeException("Employee with the same name already exists in this category.");
                }
            }
        } 
        else 
        {
            empCategory.put(category, new ArrayList<>());
        }
        empCategory.get(category).add(newEmployee);
		return newEmployee;

       //return newEmployee;)
	}
	
	public List<Employee> getEmployeesByCategory(String category) {
        return empCategory.getOrDefault(category.toLowerCase(), new ArrayList<>());
    }
	

}
