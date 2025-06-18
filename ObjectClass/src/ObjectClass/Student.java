package ObjectClass;

public class Student {

	String name;
	String college;
	int roll;
	String degree;
	String stream;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String college, int roll, String degree, String stream) {
		this.name = name;
		this.college = college;
		this.roll = roll;
		this.degree = degree;
		this.stream = stream;
	}
	
//	public String toString() {
//		return "college: "+"SVIT "+"Name: "+"Harshal";
//		
//	}
	public boolean equals(Object o) {
		Student s=(Student)o;
		return this.name==s.name && this.college==s.college && this.roll==s.roll && this.degree==s.degree && this.stream==s.stream;
	}
	
	public int hashCode() {
		return roll+ name.hashCode()+ college.hashCode()+stream.hashCode()+degree.hashCode();}
	
}
