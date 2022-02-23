package designPatterns.creational.factory;

public class FactoryDemo {

	public static void main(String[] argv) {
		ShapeFactory.getShape("Circle").draw();;
	}
}
