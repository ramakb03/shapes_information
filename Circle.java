package Shape;

public class Circle implements Shape {

	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	public double area() {
		
		return Math.PI + Math.pow(radius, 2);
	}
	public double perimeter() {
		
		return circumference();
	}
	public double getRadius() {
		
		return radius;
	}
	public double circumference() {
		
		return 2 * Math.PI * radius;
	}
}
