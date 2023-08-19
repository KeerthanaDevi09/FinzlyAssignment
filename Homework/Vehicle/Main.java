package HomeWork.Vehicle;

public class Main {
	 public static void main(String[] args) {
		 	Car c=new Car();
		 	MoterCycle m=new MoterCycle();
		 	System.out.println("Vehicle: " + c.getClass().getSimpleName());
		 	c.start();
		 	c.accelerate();
		 	c.brake();
		 	System.out.println();
		 	System.out.println("Vehicle: " + m.getClass().getSimpleName());
		 	m.start();
		 	m.accelerate();
		 	m.brake();
		 	System.out.println();
		 	
		 //polymorphism
	        Vehicle[] veh = new Vehicle[2];
	        veh[0] = new Car();
	        veh[1] = new MoterCycle();

	        for (Vehicle vehicle : veh) {
	        	System.out.println("Vehicle: " + vehicle.getClass().getSimpleName());
	        	vehicle.start();
	        	vehicle.accelerate();
	        	vehicle.brake();
	            System.out.println();
	        }
	    }
}
