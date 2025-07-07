package camera;

public class CameraDriver {

	public static void main(String[] args) {
		Camera c1=new Camera("SONY", 150000.0, 50, 8, false);
		Camera c2=new Camera("SONY", 150000.0, 50, 8, false);
		
		// checks objects by references
		System.out.println(c1==c2);  // false
		
		// check objects by attributes
		System.out.println(c1.equals(c2)); // true
		
	
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		System.out.println(c1.hashCode()==c2.hashCode());
	
	}
}
