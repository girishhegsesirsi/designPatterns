package designPatterns.creational.abstractFactory;

public class FactoryDemo {

	public static void main(String[] argv) {

		AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");
		shapeFactory.getShape("Circle").draw();;
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("Color");
		colorFactory.getColor("Red").colour();;
		
	}
}
