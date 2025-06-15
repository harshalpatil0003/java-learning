package Shapes;

public class ShapesDriver {

	public static void main(String[] args) {
		Shapes s1=new Perimeter();
		s1.triangle(30.0f, 15.0f, 20.0f, 22.3f);
		s1.square(15.2f);
		s1.rectangle(10.5f, 10.0f);
		s1.circle(5);
		
	}
}
