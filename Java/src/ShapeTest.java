import java.util.Scanner;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ShapeFac shapeFactory = new ShapeFac();

	      Shape shape1 = shapeFactory.getShape("CIRCLE");

	      shape1.draw();

	      Shape shape2 = shapeFactory.getShape("RECTANGLE");

	      shape2.draw();

	      Shape shape3 = shapeFactory.getShape("SQUARE");

	      shape3.draw();
	      

	}

}
