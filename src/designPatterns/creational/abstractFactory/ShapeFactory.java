package designPatterns.creational.abstractFactory;

public class ShapeFactory extends AbstractFactory {

	public  Shape getShape(String shape) {
		
		if (shape.equals("Circle"))
			return new Circle();
		
		if (shape.equals("Sqare"))
			return new Sqare();
		
		else
			return new Rectangle();
	}

	@Override
	Color getColor(String Color) {
		// TODO Auto-generated method stub
		return null;
	}
}
