package ObjectClass;

public class StudentDriver {

	public static void main(String[] args) {
		
		Student s1=new Student("Harshal", "SVIT", 45, "BE", "Computer");
		Student s2=new Student("Harshal", "SVIT", 45, "BE", "Computer");
		
		System.out.println(s1);
		System.out.println(s1.toString());
		
		// Compares references of both Objects.
		System.out.println(s1==s2);
		
		// Compares Attributes of both Objects.
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
