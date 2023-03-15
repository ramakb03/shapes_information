package Shape;

public class DimensionException extends Exception {

	private double length, width;
	
	public DimensionException(double length, double width) {
		//super();
		this.length = length;
		this.width = width;
	}
	public String getMessage() {
		return "error. The length " + length + " is less than the width, " + width;
	}
}
