package HomeWork.Employee;

public class Main {

	public static void main(String[] args) {
		Manager m=new Manager(1001,"Aruna","CRM");
		Developer d=new Developer(1002,"Keerthi","Java");
		m.display();
		System.out.println();
		d.display();
		
	}

}
