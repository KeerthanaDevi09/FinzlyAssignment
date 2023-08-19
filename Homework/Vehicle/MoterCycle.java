package HomeWork.Vehicle;

public class MoterCycle implements Vehicle {
	@Override
	public void start() {
		System.out.println("MoterCycle engine is started");
		
	}

	@Override
	public void accelerate() {
		System.out.println("MoterCycle is accelerating");
		
	}

	@Override
	public void brake() {
		System.out.println("MoterCycle is braking");
		
	}
}
