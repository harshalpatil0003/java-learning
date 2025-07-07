package student;

public class Student {

	String name;
	String coll;
	int age;
	int roll;
	long phno;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String coll, int age, int roll, long phno) {
		super();
		this.name = name;
		this.coll = coll;
		this.age = age;
		this.roll = roll;
		this.phno = phno;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", coll=" + coll + ", age=" + age + ", roll=" + roll + ", phno=" + phno + "]";
	}
}
