package HomeWork.Shape;

public class Triangle implements Shape{
	private double base;
	private double height;
	private double side;
	public Triangle(double base, double height, double side) {
		super();
		this.base = base;
		this.height = height;
		this.side = side;
	}
	@Override
	public double calculateArea() {
		return 0.5*base*height;
	}
	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return (2*side)+base;
	}
	

}
