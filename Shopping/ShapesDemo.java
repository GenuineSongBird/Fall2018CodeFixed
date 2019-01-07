package Shopping;

public class ShapesDemo {

	public static void main(String[] args) {
		ShapeBasics[] shapes = new ShapeBasics[2];
		shapes[0] = new Rectangle(10, 7,5);
		shapes[1] = new Triangle(2,7); //this is polymorphism
		

		for(int i =0; i<shapes.length; i++) {
			shapes[i].drawAt(i); }
			
	
	}

}
