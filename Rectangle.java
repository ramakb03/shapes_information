package Shape;

public class Rectangle implements Shape {
	//implements is for interfaces
	//extends is for sub classes 

	private double length;
	private double width;
	
	public Rectangle(double length, double width) throws Exception {
		
		if(length < width) {
			throw new DimensionException(length, width);
		}
		this.length = length;
		this.width = width;
	}
	public double getLength() {
		
		return length;
	}
	public double getWidth() {
		
		return width;
	}
	public double area() {
		
		return 2 * (length + width);
	}
	public double perimeter() {
		
		return length * width;
	}
}
