package Shape;

public class Program {

	public static void main(String[] args) throws Exception {
		
		try {
			
		Shape[] shapes = new Shape[4];
		shapes[0] = new Circle(1);
		shapes[1] = new Square(3);
		shapes[2] = new Rectangle(3, 2);
		shapes[3] = new Square(10);
		
		printShapeInformation(shapes);
	}
		catch(DimensionException e) {
			System.err.println(e.getMessage());
		}

	}
	public static void printShapeInformation(Shape[] array) {
		
		//POLYMORPHISM. Uses runtime type variables.
		
		for(int i = 0; i < array.length; i++) {
			Shape curr = array[i]; //UPCAST
			
			System.out.println(curr.perimeter() + " " +
					curr.area());
		}
	}
}
