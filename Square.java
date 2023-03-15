package Shape;

public class Square extends Rectangle { //rectangle is the parent class.

	public Square(double side) throws Exception {
		
		super(side, side); //calls superclass' constructor (Rectangle's)
	}
	public double getSide() {
		
		return getLength();
	}
}
