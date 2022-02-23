package designPatterns.creational.abstractFactory;

public class ColorFactory extends AbstractFactory{

	
public  Color getColor(String color) {
		
		if (color.equals("Red"))
			return new Red();
		
		if (color.equals("Blue"))
			return new Blue();
		
		else
			return new Green();
	}

@Override
Shape getShape(String shape) {
	// TODO Auto-generated method stub
	return null;
}

}
