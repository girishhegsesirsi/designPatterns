package designPatterns.structural.bridge;

public class Rectangle extends Shape {
	
    public Rectangle(Color color) {
        super(color);
    }
 
    @Override
    public String draw() {
        return "Rectangle drawn " + color.fill();
    }
}