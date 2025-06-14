package supercall;

public class FatherSonDriver {

	public static void main(String[] args) {
		Son s1=new Son();
		Father f1= new Father();
		System.out.println(s1.name);
		s1.displayFatherSonDetails();
		
		// ✅instanceof operator is used to check 
		// that all the members of classes are in object. 
		System.out.println(f1 instanceof Son);
		System.out.println(f1 instanceof Father);
		System.out.println(s1 instanceof Son);
		System.out.println(s1 instanceof Father);
	} 
} 
