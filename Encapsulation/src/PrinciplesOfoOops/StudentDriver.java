package PrinciplesOfoOops;

public class StudentDriver {
	public static void main(String[] args) {
		Student s1=new Student("Harshal", "java fullstack", 35000.0, "Deccan",8.50, "BE", 82.83, 87, 8767887013l);

		System.out.println(s1.getName());
		System.out.println(s1.getCourse());
		System.out.println(s1.getFees());
		System.out.println(s1.getBranch());
		System.out.println(s1.getCgpa());
		System.out.println(s1.getDegree());
		System.out.println(s1.getSscper());
		System.out.println(s1.getHscper());
		System.out.println(s1.getPhno());
		
		s1.setCourse("Qspiders","Harshal", "Python fullstack");
		s1.setPhno(true, 1234567890);
	}

	
}
