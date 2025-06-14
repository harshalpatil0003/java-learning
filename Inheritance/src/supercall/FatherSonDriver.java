package supercall;

public class FatherSonDriver {

	public static void main(String[] args) {
		Son s1=new Son();
		s1.displayName();
		System.out.println(s1.name);
		s1.displayFatherSonDetails();
	} 
} 
