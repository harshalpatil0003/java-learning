package Shapes;

public class ShapesImpl implements Shapes {
	@Override
	public void areaOfSquare(double side) {
		System.out.println("Area Of Square: "+(side*side));
		
	}
	@Override
	public void areaOfCircle(double radius) {
		System.out.println("Area Of Circle: "+(pi*radius*radius));
	}
	
	@Override
	public void perimeterOfSquare(double side) {
		System.out.println("Perimeter Of Square: "+(4*side));
		
	}
	@Override
	public void circumferenceOfCircle(double radius) {
		System.out.println("Circumference Of Circle: "+(2*pi*radius));
	}
}
