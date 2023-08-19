package HomeWork.Shape;

public class Rectangle implements Shape{
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return width*height;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 2*(width+height);
	}
	

}
