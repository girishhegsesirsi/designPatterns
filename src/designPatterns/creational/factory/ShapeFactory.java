package designPatterns.creational.factory;

public class ShapeFactory {

	public static Shape getShape(String shape) {
		
		if (shape.equals("Circle"))
			return new Circle();
		
		if (shape.equals("Sqare"))
			return new Sqare();
		
		else
			return new Rectangle();
	}
}
