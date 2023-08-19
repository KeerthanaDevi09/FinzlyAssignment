package HomeWork.Vehicle;

public class Car implements Vehicle{

	@Override
	public void start() {
		System.out.println("Car engine is started");
		
	}

	@Override
	public void accelerate() {
		System.out.println("Car is accelerating");
		
	}

	@Override
	public void brake() {
		System.out.println("Car is braking");
		
	}

}
