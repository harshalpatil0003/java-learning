package Shapes;

public class Perimeter extends Shapes {
	
	static float area;
	static float perimeter;
	public void rectangle(float len, float bred) {
		System.out.println("----------  RECTANGLE  ---------");
		System.out.println("Area of Rectangle: "+(len*bred));
		System.out.println("Perimeter of Rectangle: "+(2*(len+bred)));
	}
	
	public void square(float len) {
		System.out.println("----------  SQUARE  ---------");
		System.out.println("Area of Squre: "+(len*len));
		System.out.println("Perimeter of Square: "+(4*len));
	}
	
	public void triangle(float base,float height, float a, float b) {
		System.out.println("----------  TRIANGLE  ---------");
		System.out.println("Area of Triangle: "+(0.5*base*height));
		System.out.println("Perimeter of Triangle: "+(a+b+base));
	}
	
	public void circle(float radius) {
		System.out.println("--------  CIRCLE  ---------");
		System.out.println("Area of Circle: "+(3.1415*(radius*radius)));
		System.out.println("Perimeter of  Circle: "+(2*3.1415*radius));
	}
	

}
